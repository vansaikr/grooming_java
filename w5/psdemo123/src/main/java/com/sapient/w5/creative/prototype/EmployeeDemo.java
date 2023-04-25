package com.sapient.w5.creative.prototype;

public class EmployeeDemo {
    public static void main(String [] arg){
        Employee e=new Employee(1,"krishna","ece");
        Employee e1=(Employee) e.getClone();
        System.out.println(e+ " hashcode: "+e.hashCode());
        System.out.println(e1+ " hashcode: "+e1.hashCode());
    }
}
