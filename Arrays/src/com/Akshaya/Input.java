package com.Akshaya;
import java.util.*;
public class Input {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        arr[0]=23;
        arr[1]=35;
        arr[2]=2;
        arr[3]=6;
        arr[4]=10;

        System.out.println(arr[2]);
        //1000 times we can use for

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i:arr){
            System.out.println(i+ " ");
        }
         for(int i=0;i<arr.length;i++){
             System.out.println(i+" ");
         }
        //enhanced syntax
        //every element in array print all elements
        //index out of bound occurs when u access the elements outside the array

        //easy to print
        System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[3]="Akshaya";
        System.out.println(Arrays.toString(str));
    }
}
