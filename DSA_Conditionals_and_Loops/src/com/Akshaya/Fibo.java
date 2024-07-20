package com.Akshaya;
import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=0;
        int i=1;
        int count=2;
        System.out.print(p+" ");
        System.out.println(i+" ");

        while(count<=n){
            int temp=i;
            i=i+p;
            p=temp;
            count++;
            System.out.print(i+" ");
        }
        System.out.println("no="+i);
    }
}
