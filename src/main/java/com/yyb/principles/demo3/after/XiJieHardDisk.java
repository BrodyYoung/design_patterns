package com.yyb.principles.demo3.after;

public class XiJieHardDisk implements HardDisk {

    @Override
    public void save(String data) {
        System.out.println(data);
    }

    @Override
    public String get() {
        System.out.println("使用希捷硬盘存储数据");
        return "a.txt";
    }
}
