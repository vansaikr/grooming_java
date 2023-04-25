package com.sapient.w5.structural.adapter;

public class AdapterDemo {
    public static void main(String [] args){
        CreditCard targetInterface=new Customer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());
    }
}
