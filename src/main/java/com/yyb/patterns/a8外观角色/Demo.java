package com.yyb.patterns.a8外观角色;

public class Demo {
    public static void main(String[] args) {

        SmartAppliancesFacade s = new SmartAppliancesFacade();
        s.say("小度小度，打开电视");
    }
}
