package com.sapient.w5.creative.builder.utility;

import com.sapient.w5.creative.builder.facades.HouseBuilder;
import com.sapient.w5.creative.builder.implementations.IglooHouseBuilder;
import com.sapient.w5.creative.builder.implementations.House;
import com.sapient.w5.creative.builder.implementations.TipiHouseBuilder;

public class Builder {
    public static void main(String[] args)
    {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("engineer constructed: "+ house);

        HouseBuilder tipiBuilder = new TipiHouseBuilder();
        CivilEngineer engineer1=new CivilEngineer(tipiBuilder);
        engineer1.constructHouse();
        House house1=engineer1.getHouse();
        System.out.println("engineer 1 constructed: "+house1);
    }
}
