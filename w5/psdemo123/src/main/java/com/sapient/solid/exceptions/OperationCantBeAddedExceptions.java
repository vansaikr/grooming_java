package com.sapient.solid.exceptions;

public class OperationCantBeAddedExceptions extends RuntimeException{
    public OperationCantBeAddedExceptions(String str){
        System.out.println(str);
    }
}
