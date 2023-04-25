package com.sapient.w5.structural.facade.implementations;

import com.sapient.w5.structural.facade.facades.MobileShop;

public class Iphone implements MobileShop {
    @Override
    public String getModelName() {
        return "Iphone 4";
    }

    @Override
    public String getPrice() {
        return "75099 rs";
    }
}
