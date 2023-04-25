package com.sapient.w5.creative.prototype;

import lombok.Data;

@Data
public class Employee implements Prototype{
    private int id;
    private String name;
    private String dept;

    public Employee(int id, String name, String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }

    @Override
    public Prototype getClone() {
        return new Employee(id,name,dept);
    }
}
