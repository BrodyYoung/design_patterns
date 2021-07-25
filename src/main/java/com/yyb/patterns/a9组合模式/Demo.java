package com.yyb.patterns.a9组合模式;

public class Demo {
    public static void main(String[] args) {
        MenuComponent menu1 = new Menu("菜单管理", 1);

        menu1.add(new MenuItem("页面访问", 2));
        menu1.add(new MenuItem("展开菜单", 2));
        menu1.add(new MenuItem("编辑菜单", 2));
        menu1.add(new MenuItem("删除菜单", 2));
        menu1.add(new MenuItem("新增菜单", 2));
        MenuComponent menu2 = new Menu("权限配置", 1);
        menu2.add(new MenuItem("页面访问", 2));
        menu2.add(new MenuItem("提交保存", 2));

        MenuComponent menu3 = new Menu("角色管理", 1);
        menu3.add(new MenuItem("页面访问", 2));
        menu3.add(new MenuItem("新增角色", 2));
        menu3.add(new MenuItem("修改角色", 2));


        MenuComponent menu = new Menu("系统管理", 0);
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        menu.print();
    }


}
