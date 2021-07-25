package com.yyb.patterns.a8外观角色;

//智能音箱（外观角色）
public class SmartAppliancesFacade {

    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("指令错误");
        }
    }

    //一键开启
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }

    //一键关闭
    private void off() {
        light.off();
        tv.off();
        airCondition.off();

    }
}
