package com.sapient.w5.structural.facade.utilities;

import com.sapient.w5.structural.facade.implementations.Iphone;
import com.sapient.w5.structural.facade.implementations.Samsung;

public class ShopKeeper {
    private Iphone iphone;
    private Samsung samsung;

    public ShopKeeper(){
        this.iphone=new Iphone();
        this.samsung=new Samsung();
    }

    public Iphone iphoneSale(){
        return iphone;
    }
    public Samsung samsungSale(){
        return samsung;
    }

    public static void main(String [] args){
        ShopKeeper shopKeeper=new ShopKeeper();
        System.out.println(shopKeeper.iphoneSale().getModelName()+" -> "+ shopKeeper.iphoneSale().getPrice());
        System.out.println(shopKeeper.samsungSale().getModelName()+" -> "+ shopKeeper.samsungSale().getPrice());
    }
}
