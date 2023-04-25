package com.sapient.w5.behavioral.template;

public class Cricket extends Game{
    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void start() {
        System.out.println("Game Started. Welcome to in the Cricket game!");
    }

    @Override
    void end() {
        System.out.println("Game Finished!");
    }
}
