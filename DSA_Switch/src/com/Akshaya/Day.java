package com.Akshaya;
import java.util.*;
public class Day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no");
        int n=sc.nextInt();
        switch(n){
            case 1-> System.out.println("monday");
            case 2-> System.out.println("tuesday");
            case 3-> System.out.println("wednesday");
            case 4-> System.out.println("thursday");
            case 5-> System.out.println("friday");
            case 6-> System.out.println("sat");
            case 7-> System.out.println("sunday");
            default-> System.out.println("invalid");
        }

        switch(n){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                System.out.println("weekday");
                break;
            }
            case 6 :
            case 7: {
                System.out.println("weekend");
                break;
            }
            default:System.out.println("invalid");
        }
        //enhanced syntax
//        switch (n) {
//            case 1, 2, 3, 4, 5 -> {
//                System.out.println("weekday");
//            }
//            case 6, 7 -> {
//                System.out.println("weekend");
//            }
//            default -> System.out.println("invalid");
//        }
    }
}
