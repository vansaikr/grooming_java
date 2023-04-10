package com.sapient.w2;

import java.util.ArrayList;
import java.util.Date;

public class ImmDateObj {
    public static void main(String [] arg){
        ArrayList<String> arrlist= new ArrayList<>();
        arrlist.add("asd");
        arrlist.add("jygyq");

        Date date = new Date(2023,3,28);

        ImmutableDateList immutableDateList=new ImmutableDateList(arrlist,date);
        System.out.println("original list: "+arrlist);
        System.out.println("original date: "+date);
        arrlist.add("jhajk");
        date.setDate(29);
        System.out.println("modified list: "+arrlist);
        System.out.println("modified date: "+date);
        System.out.println("immutable obj's list and date should return originally instantiated values");
        System.out.println("immutable obj's list: "+immutableDateList.getList());
        System.out.println("immutable obj's date: "+immutableDateList.getDate().toString());


    }
}
