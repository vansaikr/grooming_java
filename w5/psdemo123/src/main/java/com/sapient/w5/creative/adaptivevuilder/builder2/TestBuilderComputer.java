package com.sapient.w5.creative.adaptivevuilder.builder2;

public class TestBuilderComputer {
    public static void main(String[] args) {

        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(comp);

        Computer computer=new Computer.ComputerBuilder()
                                        .ram("4 GB")
                                        .hdd("600 GB")
                                        .setBluetoothEnabled(true)
                                        .setGraphicsCardEnabled(true)
                                        .build();

        System.out.println(computer);
    }
}
