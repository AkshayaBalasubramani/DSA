package com.Akshaya;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no:");
        int n=sc.nextInt();
        int ans=fib(n);
        System.out.println("ans="+ans);
    }
    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
