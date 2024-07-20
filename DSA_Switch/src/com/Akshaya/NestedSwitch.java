package com.Akshaya;
import java.util.*;
public class NestedSwitch {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int empId=sc.nextInt();
    String dept = sc.next();
    //enhanced condition statements are good to do
    switch(empId)
    {
        case 1: {
            System.out.println("kunal");
            break;
        }
        case 2: {
            System.out.println("rahul");
            break;
        }
        case 3: {
            switch (dept) {
                case "It":
                    System.out.println("it dept");
                    break;
                case "management":
                    System.out.println("management dept");
                    break;
                default:
                    System.out.println("no dept");
                    break;
            }
            break;
        }
        default:
            System.out.println("incorrect details");
        }
    }
}
