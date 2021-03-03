package com.atpingan;

import com.sun.corba.se.impl.oa.toa.TOA;

/**
 * @author shkstart
 * @create 2021-02-24 11:28
 */
public class Test {
    public static void main(String args[]) {
        /*
        int x = 30;
        int y = 10;

        if( x == 10 ){
            if( y == 10 ){
                System.out.print("X = 10 and Y = 10");
            }
        }*/

//        System.out.println("访问\"菜鸟教程!\"");
        /*char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
        String helloString = new String(helloArray);
        System.out.println( helloString );*/

//        System.out.println("我的名字是 ".concat("Runoob"));

       /* // 数组大小
        int size = 10;
        // 定义数组
        double[] myList = new double[size];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        // 计算所有元素的总和

//        double total = 0;
        double max = myList[0];
       for(int i =1 ; i < myList.length;i++){
           if (myList[i] > max){
               max = myList[i];
           }
       }
        System.out.println(max);*/
      /*  for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);*/

        MyClass t1 = new MyClass(1);
        MyClass t2 = new MyClass(2);
        System.out.println(t1.x + " " + t2.x);
    }
    }
   /* public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }*/


// 一个简单的构造函数
class MyClass {
    int x;

    // 以下是构造函数
    MyClass(int i ) {
        x = i;
    }
}
