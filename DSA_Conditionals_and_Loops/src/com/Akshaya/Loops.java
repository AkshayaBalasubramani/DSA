package com.Akshaya;

import java.util.*;

public class Loops{
    public static void main(String[] args) {
        //print no's from 1 to 5
//        System.out.println("1");
//        System.out.println("2");
//        System.out.println("3");
//        System.out.println("4");
//        System.out.println("5");

        for (int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }

        Scanner input=new Scanner(System.in);
        System.out.print("enter value for n:");
        int n=input.nextInt();
//        for(int i=0;i<=n;i++){
//           // System.out.println(i);
//            System.out.println("hello");
//        }

        //while
        int j=0;
        while(j<n)
        {
            System.out.println(j);
            j++;
        }

        //do while
        int num=0;
        do{
            System.out.println(num);
            num++;
        }while(num<=10);

        int p=1;
        do{
            System.out.println("in");
        }while(p<0);

        //this checks the condition only after executing once

    }
}

