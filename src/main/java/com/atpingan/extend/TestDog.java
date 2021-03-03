package com.atpingan.extend;

/**
 * @author shkstart
 * @create 2021-02-24 17:24
 */
public class TestDog {
    public static void main(String args[]){
        Animal1 a = new Animal1(); // Animal 对象
        Dog b = new Dog(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
//        b.bark();
    }
}

class Animal1{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal1{
    public void move(){
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}
