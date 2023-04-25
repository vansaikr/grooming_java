package com.sapient.w5.structural.facade.implementations;

import com.sapient.w5.structural.facade.facades.MobileShop;

public class Samsung implements MobileShop {
    @Override
    public String getModelName() {
        return "Samsung Galaxy 6";
    }

    @Override
    public String getPrice() {
        return "45999 rs";
    }
}
