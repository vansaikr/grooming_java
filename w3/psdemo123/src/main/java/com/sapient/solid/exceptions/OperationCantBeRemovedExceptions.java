package com.sapient.solid.exceptions;

public class OperationCantBeRemovedExceptions extends RuntimeException{
    public OperationCantBeRemovedExceptions(String str){
        System.out.println(str);
    }
}
