package com.sapient.w5;

public class SingletonDemo {
    private static SingletonDemo obj;

    // private constructor to force use of
    // getInstance() to create Singleton object
    private SingletonDemo() {
        System.out.println("constructor private");
        if(obj!=null){
            throw new RuntimeException("obj already exists");
        }
    }

    public static SingletonDemo getInstance()
    {
        if (obj==null)
            obj = new SingletonDemo();
        return obj;
    }

    //does not support clone operation
    @Override
    protected Object clone() throws CloneNotSupportedException  {
        throw new CloneNotSupportedException();
    }

    //does not create two instances upon deserialization
    protected Object readResolve() {
        return obj;
    }

    public static void main(String [] arg) throws CloneNotSupportedException {
        System.out.println("demo 1");
        SingletonDemo singletonDemo=new SingletonDemo();
        getInstance();
//        System.out.println("demo 2");
//        SingletonDemo singletonDemo1=new SingletonDemo();
//        getInstance();
        singletonDemo.clone();
    }

}
