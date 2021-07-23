package com.yyb.principles.demo3.after;

public class demo {

    public static void main(String[] args) {
//        Cpu c = new IntelCpu();
        Cpu c = new AMDCpu();
        Memory m = new KingstonMemory();
        HardDisk x = new XiJieHardDisk();

        Computer cp = new Computer();
        cp.setCpu(c);
        cp.setHardDisk(x);
        cp.setMemory(m);

        cp.run();
    }
}
