package com.sapient;

public enum Pizza {

        // enum constants calling the enum constructors
        SMALL("The size is small ","Shape is circle" ),
        MEDIUM("The size is medium ","Shape is square"),
        LARGE("The size is large ","Shape is triangle"),
        EXTRALARGE("The size is extra large ","Shape is hexagon");

        private final String pizzaSize;
        private final String pizzaShape;

        // private enum constructor
        private Pizza(String pizzaSize, String pizzaShape) {
            this.pizzaSize = pizzaSize;
            this.pizzaShape = pizzaShape;
        }

        public String getPizza() {
            return pizzaSize + pizzaShape;
        }
}
