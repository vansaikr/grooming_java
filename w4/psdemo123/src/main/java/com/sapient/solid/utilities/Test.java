package com.sapient.solid.utilities;

import com.sapient.solid.facades.Calculator;
import com.sapient.solid.facades.Operation;
import com.sapient.solid.impls.AdditionImpl;
import com.sapient.solid.impls.CalculatorImpl;
import com.sapient.solid.impls.SubtractionImpl;

public class Test {
    public static void main(String [] arg){
        Calculator calculator=new CalculatorImpl();
        Operation addition = new AdditionImpl();
        Operation subtraction= new SubtractionImpl();

        //addition
        calculator.addOperation(addition);
        //subtraction
        calculator.addOperation(subtraction);

        //uncomment this for exception to occur
        //calculator.addOperation(addition);

        System.out.println(addition.execute(1,2));
        System.out.println(subtraction.execute(1,2));
    }
}
