package com.bohu.Controller;

import com.bohu.Controller.utils.FlowUtils;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowNode;
import org.activiti.bpmn.model.SequenceFlow;
import org.activiti.engine.HistoryService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.image.ProcessDiagramGenerator;
import org.activiti.spring.ProcessEngineFactoryBean;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Route
 * @Author shenbohu
 * @Date 2022/6/411:24
 * @Version 1.0
 **/
@RestController
@RequestMapping("route")
public class Route {

    @Autowired
    RuntimeService runservice;
    @Autowired
    private HistoryService historyService;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private ProcessEngineFactoryBean processEngine;

    /**
     * 查看实例流程图，根据流程实例ID获取流程图
     */
    @RequestMapping(value="traceprocess/{instanceId}",method=RequestMethod.GET)
    public void traceprocess(HttpServletResponse response, @PathVariable("instanceId")String instanceId) throws Exception{
        InputStream in = getResourceDiagramInputStream(instanceId);
        ServletOutputStream output = response.getOutputStream();
        IOUtils.copy(in, output);
    }



    /**
     * 获取历史节点流程图
     *
     * @param id
     * @return
     */
    public  InputStream getResourceDiagramInputStream(String id) {
        try {
            // 获取历史流程实例
            HistoricProcessInstance historicProcessInstance = historyService.createHistoricProcessInstanceQuery().processInstanceId(id).singleResult();
            // 获取流程中已经执行的节点，按照执行先后顺序排序
            List<HistoricActivityInstance> historicActivityInstanceList = historyService.createHistoricActivityInstanceQuery().processInstanceId(id).orderByHistoricActivityInstanceId().asc().list();
            // 构造已执行的节点ID集合
            List<String> executedActivityIdList = new ArrayList<String>();
            for (HistoricActivityInstance activityInstance : historicActivityInstanceList) {
                executedActivityIdList.add(activityInstance.getActivityId());
            }
            // 获取bpmnModel
            BpmnModel bpmnModel = repositoryService.getBpmnModel(historicProcessInstance.getProcessDefinitionId());
            // 获取流程已发生流转的线ID集合
            List<String> flowIds = this.getExecutedFlows(bpmnModel, historicActivityInstanceList);
            // 使用默认配置获得流程图表生成器，并生成追踪图片字符流
            ProcessDiagramGenerator processDiagramGenerator = processEngine.getProcessEngineConfiguration().getProcessDiagramGenerator();
            //你也可以 new 一个
            //DefaultProcessDiagramGenerator processDiagramGenerator = new DefaultProcessDiagramGenerator();
            InputStream imageStream = processDiagramGenerator.generateDiagram(bpmnModel, "png", executedActivityIdList, flowIds, "宋体", "微软雅黑", "黑体", null, 2.0);
            return imageStream;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private List<String> getExecutedFlows(BpmnModel bpmnModel,
                                          List<HistoricActivityInstance> historicActivityInstanceList) {
        List<String> executedFlowIdList = new ArrayList<>();
        for (int i = 0; i < historicActivityInstanceList.size() - 1; i++) {
            HistoricActivityInstance hai = historicActivityInstanceList.get(i);
            FlowNode flowNode = (FlowNode) bpmnModel.getFlowElement(hai.getActivityId());
            List<SequenceFlow> sequenceFlows = flowNode.getOutgoingFlows();
            if (sequenceFlows.size() > 1) {
                HistoricActivityInstance nextHai = historicActivityInstanceList.get(i + 1);
                sequenceFlows.forEach(sequenceFlow -> {
                    if (sequenceFlow.getTargetFlowElement().getId().equals(nextHai.getActivityId())) {
                        executedFlowIdList.add(sequenceFlow.getId());
                    }
                });
            } else if (sequenceFlows.size() == 1) {
                executedFlowIdList.add(sequenceFlows.get(0).getId());
            }
        }
        return executedFlowIdList;

    }

}
