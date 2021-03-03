package com.atpingan.exception;

import javax.sound.midi.Soundbank;

/**
 * @author shkstart
 * @create 2021-02-24 15:49
 */
public class BankDemo {
    public static void main(String [] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.cq(500);
        System.out.println(c.getBalance());

        try {
            c.qq(600);
            System.out.println(c.getBalance());
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
            System.out.println("差钱:" + e.getAmount());
        }
//        System.out.println(c.getBalance());

       /* try
        {
            System.out.println("\nWithdrawing $100...");
            c.qq(100.00);
            System.out.println("\nWithdrawing $600...");
            c.qq(600.00);
        }catch(InsufficientFundsException e)
        {
            System.out.println("Sorry, but you are short $"
                    + e.getAmount());
            e.printStackTrace();
        }*/
    }
}
