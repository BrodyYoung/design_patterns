package com.yyb.principles.demo5;

public class demo {
    public static void main(String[] args) {

        Agent agent = new Agent();

        agent.setCompany(new Company("华夏公司"));
        agent.setFans(new Fans("小吴"));
        agent.setStar(new Star("焦迈奇"));
        agent.meeting();
        System.out.println("=================");
        agent.business();
    }
}
