package com.atpingan.extend;

/**
 * @author shkstart
 * @create 2021-02-24 17:29
 */
public class TestDog1 {
    public static void main(String args[]){
        Animal2 b = new Dog1(); // Dog 对象
        b.move(); //执行 Dog类的方法

    }
}

class Animal2{
    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog1 extends Animal2{
    public void move(){
//        super.move(); // 应用super类的方法
        System.out.println("狗可以跑和走");
    }
}
