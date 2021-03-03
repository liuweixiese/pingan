package com.atpingan;

/**
 * @author shkstart
 * @create 2021-02-24 15:02
 */
public class VarargsDemo {
    public static void main(String args[]){
    try{
        int a[] = new int[2];
        System.out.println("Access element three :" + a[3]);
    }catch(ArrayIndexOutOfBoundsException e){
//        System.out.println("Exception thrown  :" + e);
        e.printStackTrace();
    }
    System.out.println("Out of the block");
}
}

class Cake extends  Object {
    private int id;
    public Cake(int id) {
        this.id = id;
        System.out.println("Cake Object " + id + '\t' + "is created");
    }

    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cake Object " + id +  '\t' + "is disposed");
    }
}
