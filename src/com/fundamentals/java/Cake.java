package com.fundamentals.java;

public class Cake implements InsideInterface {
    public int layer;
    private int sum;
    public String layer1flav;
    public String layer2flav;
    public String frosting;
    public void addNumbers() {
        sum = layer + layer;
    }
    public void showIt() {
        System.out.println("The top layer is " + this.layer1flav + " flavored.\n");
        System.out.println("The bottom layer is " + this.layer2flav + " flavored.\n");
        System.out.println("It's actually a " + this.sum + " layered cake.\n");
        System.out.println("The icing is " + this.frosting + " flavored.\n");
    }


    public String layer3flav;
    public String layer4flav;
    public String moreFrostig;
    public void addMoreNumbers() {
        sum = layer + layer;
    }

    public void showThisAlso(){
        System.out.println("The top layer is " + this.layer3flav + " flavored.\n");
        System.out.println("The bottom layer is " + this.layer4flav + " flavored.\n");
        System.out.println("It's a " + this.sum + " layered cake.\n");
        System.out.println("The icing is " + moreFrostig + " flavored.\n");
        }
    }
