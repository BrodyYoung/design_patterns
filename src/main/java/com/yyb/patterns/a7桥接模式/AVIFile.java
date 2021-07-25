package com.yyb.patterns.a7桥接模式;

//avi视频（具体实现化角色）
public class AVIFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("avi格式文件：" + fileName);
    }
}
