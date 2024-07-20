package com.Akshaya;
public class Main {
    public static void main(String[] args) {

        //store a roll no
        int rno = 1;

        //store a name
        String name = "aks";

        //store 5 nos
        int rno1 = 1;
        int rno2 = 2;
        int rno3 = 3;
        int rno4 = 4;
        int rno5 = 5;

        //for storing 100 nos itll be diff to create a var for each and every value
        //it makes more sense to store a collection of the variables of same datatype under one ds
        //this is made possible using arrays

        //syntax
        //declaration syntax
        //datatype[] a=new datatype[size]
        int[] roll=new int[5];
        //direct
        int[] roll2={1,2,3};//without size
        //so the value in the begining is [0,0,0,0,0]

        //string array has null values filled
        //null is a special literal
        //can't declare as data type
        //can assign it to other variable
        System.out.println(roll[2]);

        String[] names=new String[9];
        System.out.println(names[3]);
    }

}

