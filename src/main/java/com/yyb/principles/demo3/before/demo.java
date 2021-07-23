package com.yyb.principles.demo3.before;

public class demo {

    public static void main(String[] args) {
        IntelCpu c = new IntelCpu();
        KingstonMemory m = new KingstonMemory();
        XiJieHardDisk x = new XiJieHardDisk();

        Computer cp = new Computer();
        cp.setCpu(c);
        cp.setHardDisk(x);
        cp.setMemory(m);

        cp.run();
    }
}
