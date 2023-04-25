package com.sapient.w5.structural.adapter;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Customer extends BankDetails implements CreditCard{
    @Override
    public void giveBankDetails() {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the account holder name :");
            String customername=br.readLine();
            System.out.print("\n");

            System.out.print("Enter the account number:");
            String accNo=br.readLine();
            long accno=Long.parseLong(accNo);
            System.out.print("\n");

            System.out.print("Enter the bank name :");
            String bankname=br.readLine();

            setAccHolderName(customername);
            setAccNumber(accno);
            setBankName(bankname);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public String getCreditCard() {
        long accNo=getAccNumber();
        String accHolderName=getAccHolderName();
        String bankName=getBankName();
        String out;
        if(accNo>0 && accHolderName.equals("") && bankName.equals("")){
            out = "The Account number "+accNo+" of "+accHolderName+" in "+bankName+
                    " bank is valid and authenticated for issuing the credit card. ";
        }
        else {out = "The Account number "+accNo+" of "+accHolderName+" in "+bankName+
                " bank is not valid and not authenticated for issuing the credit card. ";}
        return out;

    }
}
