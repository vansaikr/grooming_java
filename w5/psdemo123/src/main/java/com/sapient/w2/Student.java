package com.sapient.w2;

class Student {
    // instance variable
    static String name = "Tony Stark";

    public void print() {
        // local variable
        name = "Steve Rogers";
        System.out.println(name);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.print();
    }
}
