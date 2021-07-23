package com.yyb.patterns.a1单例模式.Runtime;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class Demo {
    public static void main(String[] args) throws IOException {

        Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.maxMemory());
        System.out.println("===================================");

        Process p = r.exec("ipconfig");

        InputStream is = p.getInputStream();
        byte[] b = new byte[1024 * 1024 * 200];

        int read = is.read(b);

        System.out.println(new String(b, 0, read, "gbk"));

    }
}
