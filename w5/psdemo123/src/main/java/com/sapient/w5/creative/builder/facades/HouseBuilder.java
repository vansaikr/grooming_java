package com.sapient.w5.creative.builder.facades;

import com.sapient.w5.creative.builder.implementations.House;

public interface HouseBuilder {
    public void buildBasement();

    public void buildStructure();

    public void buildRoof();

    public void buildInterior();

    public House getHouse();
}
