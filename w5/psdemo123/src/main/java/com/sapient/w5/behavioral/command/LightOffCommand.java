package com.sapient.w5.behavioral.command;

public class LightOffCommand implements Command{
    Light light;
    public LightOffCommand(Light light)
    {
        this.light = light;
    }
    public void execute()
    {
        light.off();
    }
}
