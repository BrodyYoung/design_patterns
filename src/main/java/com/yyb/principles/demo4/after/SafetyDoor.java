package com.yyb.principles.demo4.after;

public class SafetyDoor implements AntiTheft, WaterProof {


    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }
}
