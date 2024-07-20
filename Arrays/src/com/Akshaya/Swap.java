package com.Akshaya;
import java.util.*;
//passing in functions
public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
