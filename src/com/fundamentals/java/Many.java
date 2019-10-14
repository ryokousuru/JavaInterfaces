package com.fundamentals.java;

public class Many implements Join1,Join2
{
    public String st;
    public String cr;
    public String nw;
    public String se;
    public String where;
    public void intersectionLoc() {
        System.out.println("It\'s at " + this.st + " & " + this.cr + ".\n");
    }
    public void intersection(){
        System.out.println("The street is " + this.st + ".\n");
        System.out.println("The cross street is " + this.cr + ".\n");
    }

    public void mailboxCorner(){
        System.out.println("The mailbox is over there " + this.where + ".\n");
    }

    public void mailboxLoc() {
        System.out.println("The mailbox is on the " + this.nw + " corner.\n");
        System.out.println("Diagonally opposite from the " + this.se + " corner.\n");
    }
}
