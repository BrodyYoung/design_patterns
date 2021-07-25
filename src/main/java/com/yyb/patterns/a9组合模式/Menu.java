package com.yyb.patterns.a9组合模式;

import java.util.ArrayList;
import java.util.List;

//树枝节点角色
public class Menu extends MenuComponent {

    private List<MenuComponent> ml = new ArrayList<MenuComponent>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        ml.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        ml.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return ml.get(i);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);

        for (MenuComponent m : ml) {
            m.print();
        }
    }
}
