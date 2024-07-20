package com.Akshaya;

//2 methods to find the frequency of the numbers in a group of numbers

import java.util.Scanner;
import java.lang.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer n=sc.nextInt();
        int count=0;
        String s=n.toString();
        while(n>0){
            if(n%10==7){
                count++;
            }
            n=n/10;
        }
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            int p=s.charAt(i);
            if (p=='7')
                c++;
        }
        System.out.println("no of times it occurs="+count);
        System.out.println("count="+c);
    }
}
