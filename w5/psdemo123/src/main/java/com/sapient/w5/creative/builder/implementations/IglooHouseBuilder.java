package com.sapient.w5.creative.builder.implementations;

import com.sapient.w5.creative.builder.facades.HouseBuilder;

public class IglooHouseBuilder implements HouseBuilder {
    private House house;

    public IglooHouseBuilder()
    {
        this.house = new House();
    }
    @Override
    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice Blocks");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice carvings");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
