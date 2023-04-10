package com.sapient;

public class RunTimePloyChild extends RunTimePolyParent{
    @Override
    public void method() {
        System.out.println("Method in child");
    }
    public static void main(String [] arg){
        RunTimePolyParent runTimePolyParent1=new RunTimePolyParent();
        runTimePolyParent1.method();

        RunTimePolyParent runTimePolyParent=new RunTimePloyChild();
        runTimePolyParent.method();

        RunTimePloyChild runTimePloyChild=new RunTimePloyChild();
        runTimePloyChild.method();

        /*child cannot reference parent
        RunTimePloyChild runTimePloyChild1=new RunTimePolyParent();
        runTimePloyChild1.method();
        */
    }
}
