package com.study.BV1uJ411k7wy.Package10InnerClass;

public class Outer {

    int num = 10;

    public class Inner {

        int num = 20;

        public void methodInner() {
            int num = 30;
            System.out.println(num); // 局部变量，就近原则
            System.out.println(this.num); // 内部类的成员变量
            System.out.println(Outer.this.num);  // 外部类的成员变量
        }

    }
}