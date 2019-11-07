package com.benno;

    /*
        NAMA        : BENNO ALIF ANGGARA
        KELAS       : IF1
        NIM         : 10118024
        Deskripsi   : Rabbit
     */

public class Main {

    public static void main(String[] args) {
	    Rabbit obj = new Rabbit(false, "grass", 4, "grey", "Peter");

        System.out.println("Hello, His name is " + obj.getName());
        System.out.println(obj.getName() + " is Vegetarian? " + obj.isVegetarian());
        System.out.println(obj.getName() + " eats " + obj.getEats());
        System.out.println(obj.getName() + " has " + obj.getNoOfLegs() + " legs");
        System.out.println(obj.getName() + " color is " + obj.getColor());
    }
}
