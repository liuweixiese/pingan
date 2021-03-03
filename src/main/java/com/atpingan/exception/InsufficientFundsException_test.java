package com.atpingan.exception;

/**
 * @author shkstart
 * @create 2021-02-24 15:59
 */
public class InsufficientFundsException_test {
    public static void main(String[] args){
        InsufficientFundsException inf = new InsufficientFundsException(0.5);
        System.out.println(inf.getAmount());

    }
}
