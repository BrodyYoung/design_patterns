package com.yyb.principles.demo3.after;

public class Computer {
    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;

    public void run() {
        System.out.println("计算机运行");
        String data = hardDisk.get();
        System.out.println("从硬盘上获取到的数据是:" + data);

        cpu.run();
        memory.save();
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
