package com.yyb.patterns.a3原型模式.demo3;

public class Citation implements Cloneable {

    private Student s;

    public Citation() {
    }

    public Citation(Student s) {
        this.s = s;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public void show() {
        System.out.println(s.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {

        return (Citation) super.clone();
    }
}
