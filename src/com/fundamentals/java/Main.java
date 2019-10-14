package com.fundamentals.java;

public class Main {

    public static void main(String[] args) {

        //howToUseInterfaceExample();
        multipleInterfacesExample();
        //interfaceInPropertiesExample();
        //interfaceInPropertiesExample2();
        //interfaceExtendInterfaceExample1();
        //interfaceExtendInterfaceExample2();
    }

    public static void howToUseInterfaceExample() {
        Dictionary di = new Dictionary();
        di.Definition = "French-English, English-French";
        di.Source = "wikipedia";
        di.Elevated = "monorail";
        di.Screen = "displayed";
        di.exhibit();
        di.nextExhibit();
        di.model();
        di.outPut();
    }
    public static void multipleInterfacesExample() {
        Many mn = new Many();
        mn.st = "15th";
        mn.cr = "Broadway";
        mn.nw = "northwest";
        mn.intersection();
        mn.intersectionLoc();
        Many mb = new Many();
        mb.nw = "northwest";
        mb.se = "southeast";
        mb.where = "down the street";
        mb.mailboxCorner();
        mb.mailboxLoc();
    }
    public static void interfaceInPropertiesExample () {
        Props pr = new Props();
        pr.airportName = "itami";
        pr.airportCity = "Osaka";
        pr.intProp();
        pr.interProp();
        System.out.println("A favorite number is " + pr.favorNumber + ".\n");
    }

    public static void interfaceInPropertiesExample2 () {
        Props pp = new Props();
        pp.doorColor = "white";
        pp.knobColor = "yellow";
        pp.theDoor();
        pp.theKnob();
        System.out.println("The number of hinges is " + pp.hinges + ".\n");
    }
    public static void interfaceExtendInterfaceExample1() {
        Cake ck = new Cake();
        ck.layer = 1;
        ck.layer1flav = "vanilla";
        ck.layer2flav = "banana";
        ck.frosting = "cherry";
        ck.addNumbers();                //not calling this method makes it a frosting only cake
        ck.showIt();
    }
    public static void interfaceExtendInterfaceExample2() {
        Cake ce = new Cake();
        ce.layer = 1;
        ce.layer3flav = "almond";
        ce.layer4flav = "cinnamon";
        ce.moreFrostig = "coconut";
        ce.addMoreNumbers();
        ce.showThisAlso();
    }
}
