package com.yyb.patterns.a7桥接模式.demo1;

//rmvb视频（具体实现化角色）
public class RMVBFile implements VideoFile {

    @Override
    public void decode(String fileName) {
        System.out.println("rmvb格式文件：" + fileName);
    }
}
