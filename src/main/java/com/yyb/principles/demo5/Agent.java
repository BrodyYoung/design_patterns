package com.yyb.principles.demo5;

public class Agent {
    private Star star;
    private Company company;
    private Fans fans;

    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }


    public void business() {
        System.out.println(star.getName() + "和" + company.getName() + "洽谈");
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }
}
