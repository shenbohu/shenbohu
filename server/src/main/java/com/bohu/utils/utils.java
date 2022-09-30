package com.bohu.utils;

import com.spire.doc.FileFormat;
import com.spire.doc.Section;
import com.spire.doc.TextWatermark;
import com.spire.doc.documents.WatermarkLayout;

import java.awt.*;
import java.util.Objects;
import java.util.function.BiConsumer;

public class utils {

    public static <E> void forEach(Iterable<? extends E> elements, BiConsumer<Integer, ? super E> action) {
        Objects.requireNonNull(elements);
        Objects.requireNonNull(action);
        int index = 0;
        for (E element : elements) {
            action.accept(index++, element);
        }
    }

    public static <E> void forEach(Iterable<? extends E> elements, BiConsumer<Integer, ? super E> action , int num) {
        Objects.requireNonNull(elements);
        Objects.requireNonNull(action);
        int index = num;
        for (E element : elements) {
            action.accept(index++, element);
        }
    }


    /**
     * word添加水印
     * @param filePath 需要添加水印的文件地址
     * @param targetPath 水印生成后的文件地址
     * @param mark 水印文字
     * @return  添加水印后的临时文件地址（需要删除）
     *
     */
    public static String InsertWordWatermark(String filePath,String targetPath,String mark){

        com.spire.doc.Document document = new com.spire.doc.Document();
        document.loadFromFile(filePath);
        Section section = document.getSections().get(0);

        //添加水印
        TextWatermark txtWatermark = new TextWatermark();
        txtWatermark.setText(mark);
        txtWatermark.setFontSize(40);
        txtWatermark.setColor(Color.red);
        txtWatermark.setLayout(WatermarkLayout.Diagonal);
        section.getDocument().setWatermark(txtWatermark);

        document.saveToFile(targetPath, FileFormat.Docx );

        return targetPath;
    }
}
