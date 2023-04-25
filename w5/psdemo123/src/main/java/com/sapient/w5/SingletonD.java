package com.sapient.w5;

import java.io.Serializable;

public class SingletonD implements Serializable,Cloneable {
    private static SingletonD obj;
    private SingletonD(){

    }
    public static SingletonD getIns() throws InterruptedException {
        if(obj==null){
            synchronized(SingletonD.class){
                if(obj==null){
                    obj=new SingletonD();
                    Thread.sleep(10000);
                }
            }
        }
        Thread.sleep(2000);
        return obj;
    }

    protected Object readResolve(){
        return obj;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
