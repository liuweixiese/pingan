package com.atpingan.exception;

/**
 * @author shkstart
 * @create 2021-02-24 15:45
 */
public class CheckingAccount {
    private int number;
    private double balance;
    public CheckingAccount(int number){
        this.number = number;
    }

    public void cq(double money){
        this.balance += money;
    }

    public void qq(double money) throws InsufficientFundsException {
        if (balance >= money){
            balance -= money;
        }else {
            double needs = money - balance;
            throw  new InsufficientFundsException(needs);
        }
    }

    public double getBalance(){
        return balance;
    }

    public int getNumber(){
        return number;
    }















    /*
    //balance为余额，number为卡号
    private double balance;
    private int number;
    public CheckingAccount(int number)
    {
        this.number = number;
    }
    //方法：存钱
    public void deposit(double amount)
    {
        balance += amount;
    }
    //方法：取钱
    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount <= balance)
        {
            balance -= amount;
        }
        else
        {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
    //方法：返回余额
    public double getBalance()
    {
        return balance;
    }
    //方法：返回卡号
    public int getNumber()
    {
        return number;
    }*/
}