package com.Akshaya;
import java.util.*;
import java.lang.*;
import java.io.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Integer n=sc.nextInt();
        int t=n;
        int new_no=0;
        while(n>0){
            int p=n%10;
            new_no=new_no*10+p;
            n=n/10;
        }
    }
}
