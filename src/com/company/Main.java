package com.company;

public class Main {

    public static void main(String[] args) {



        Account a = new Account();
        Customer c = new Customer("Cristopher", "Gonzalez");
        a.deposit(1500);
        a.withdraw(1200);
        c.setAccount(a);

        System.out.println("Hola mi nombre es: "+ c.getFirstName()+" "+c.getLastName());
        System.out.println("Mi balance es : "+ a.getBalance()+"\n");

        Account a2 = new Account();
        Customer c2 =new Customer("Luis", " Perez");
        c2.setAccount(a2);
        a2.deposit(1500);
        a2.withdraw(1700);

        System.out.println("Hola mi nombre es: "+ c2.getFirstName()+" "+c2.getLastName());
        System.out.println("Mi balance es : "+ a2.getBalance()+"\n");








    }
}
