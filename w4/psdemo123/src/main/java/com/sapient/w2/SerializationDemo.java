package com.sapient.w2;

public class SerializationDemo implements java.io.Serializable {
    public int a;
    public String b;

    // Default constructor
    public SerializationDemo(int a, String b){
        this.a = a;
        this.b = b;
    }
}
