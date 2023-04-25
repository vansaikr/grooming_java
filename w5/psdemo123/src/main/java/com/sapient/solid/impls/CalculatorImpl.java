package com.sapient.solid.impls;

import com.sapient.solid.exceptions.OperationCantBeAddedExceptions;
import com.sapient.solid.facades.Calculator;
import com.sapient.solid.facades.Operation;
import com.sapient.solid.exceptions.OperationCantBeRemovedExceptions;

import java.util.ArrayList;
import java.util.List;

public class CalculatorImpl implements Calculator {
    List<Operation> operations;
    public CalculatorImpl(){
        this.operations=new ArrayList<>();
    }

    @Override
    public void addOperation(Operation operation){
        if(operations.contains(operation)){
            throw new OperationCantBeAddedExceptions("Operation cant be added to the list");
        }else{
            operations.add(operation);
        }
    }

    @Override
    public void removeOperation(Operation operation) {
        if(operations.contains(operation)){
            operations.remove(operation);
        }else{
            throw new OperationCantBeRemovedExceptions( "Operation cant be removed from the list");
        }

    }
}
