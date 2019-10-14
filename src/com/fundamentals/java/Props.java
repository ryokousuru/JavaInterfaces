package com.fundamentals.java;

public class Props implements InterfaceProp1,InterfaceProp2 {
    public String airportName;
    public String airportCity;
    public void interProp() {
        System.out.println("The airport is called " + this.airportName + ".\n");
        System.out.println("It's located in " + this.airportCity + ".\n");
    }
    public void intProp() {
        System.out.println("The international airport is " + this.airportName +
                " and it's located in " + this.airportCity + ".\n");
    }

    public String doorColor;
    public String knobColor;
    public void theKnob() {
        System.out.println("The door color is " + this.doorColor + ".\n");
        System.out.println("The knob color is " + this.knobColor + ".\n");
    }
    public void theDoor(){
        System.out.println("The door is " + this.doorColor + " and " +
                        "the knob is " + knobColor + ".\n");
    }
}
