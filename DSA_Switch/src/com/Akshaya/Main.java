package com.Akshaya;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit  =sc.next();
        //based on input we need to display few sentences

        //if else is not a very nice syntax hence we hav
//        if(fruit.equals("mango"))
//            System.out.println("king");
//        if(fruit.equals("apple"))
//            System.out.println("red");

        //switch case
        switch(fruit)
        {
            case "mango":
                System.out.println("king");
                break;
            case "apple" :
                System.out.println("red fruit");
                break;
            case "grapes":
                System.out.println("small green fruit");
                break;
            default:
                System.out.println("not in db");
        }
//        switch (fruit) {
//            case "mango" -> System.out.println("king");
//            case "apple" -> System.out.println("red fruit");
//            case "grapes" -> System.out.println("small green fruit");
//            default -> System.out.println("not in db");
//        }
        //enhanced switch statement

    }
}
