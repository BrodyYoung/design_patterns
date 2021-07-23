package com.yyb.patterns.a1单例模式.问题.demo1;

import java.io.*;

public class Demo {
    public static void main(String[] args) throws Exception {
//        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    //输出
    public static void writeObject2File() throws Exception {
        Singleton s = Singleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Young\\Desktop\\a.txt"));
        oos.writeObject(s);
        oos.close();
    }

    //输入
    public static void readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Young\\Desktop\\a.txt"));

        Singleton s = (Singleton) ois.readObject();
        System.out.println(s);
        ois.close();
    }

}
