package com.company;

public class Account{
    private double balance;

    public Account (){

    }
    public void deposit (double monto){
        balance = balance+monto;
    }
    public void withdraw (double monto){
        if((balance-monto)<=0){
            balance=balance;
        }       else {
                balance = balance-monto;
                }
    }

    public double getBalance() {
        return balance;
    }
}
