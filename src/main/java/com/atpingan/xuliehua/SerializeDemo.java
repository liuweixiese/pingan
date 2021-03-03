package com.atpingan.xuliehua;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author shkstart
 * @create 2021-02-25 13:42
 */
public class SerializeDemo
{
    public static void main(String [] args)
    {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        try
        {
            FileOutputStream fileout = new FileOutputStream("C:\\Users\\liuwei\\Desktop\\out\\employee2.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("输出完成");










           /* FileOutputStream fileOut =
                    new FileOutputStream("C:\\Users\\liuwei\\Desktop\\out\\employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");*/
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }
}
