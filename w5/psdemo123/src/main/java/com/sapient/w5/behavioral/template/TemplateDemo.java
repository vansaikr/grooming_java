package com.sapient.w5.behavioral.template;

public class TemplateDemo {
    public static void main(String []arg){
        Game game=new Cricket();
        game.play();

        Game game1=new Chess();
        game1.play();
    }
}
