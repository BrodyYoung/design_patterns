package com.yyb.principles.demo4.before;

public class HeimaSafetyDoor implements SafetyDoor {
    @Override
    public void antiTheft() {
        System.out.println("防盗功能");
    }

    @Override
    public void fireproof() {
        System.out.println("防火功能");
    }

    @Override
    public void waterproof() {
        System.out.println("防水功能");
    }
}
