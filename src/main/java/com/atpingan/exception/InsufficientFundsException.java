package com.atpingan.exception;

/**
 * @author shkstart
 * @create 2021-02-24 15:46
 */
public class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(double amount){
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }
















    /*//此处的amount用来储存当出现异常（取出钱多于余额时）所缺乏的钱
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount()
    {
        return amount;
    }*/
}
