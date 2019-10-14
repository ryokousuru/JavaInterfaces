package com.fundamentals.java;

public class Dictionary implements Declare      //defining a class
{
    /*
    *the method of the interface is being defined by
    *the class since the class is implementing it
    * */
    public String Definition;
    public String Source;
    public String Elevated;
    public String Screen;
    public void exhibit() {
        System.out.println("It's a " +                      //the defined class implements
                this.Definition + " dictionary.\n");        //the method of the interface
    }
    public void nextExhibit() {
        System.out.println("The name of the encyclopedia is " + this.Source + ".\n");
    }
    public void model() {
        System.out.println("The model resembles the " + this.Elevated + " in the eastern part of Tokyo.\n");
    }
    public void outPut() {
        System.out.println("The screen outputs the data that is to be " + this.Screen + ".\n");
    }
}
