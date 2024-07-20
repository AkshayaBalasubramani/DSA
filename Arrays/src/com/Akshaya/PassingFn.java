package com.Akshaya;
import java.util.*;
public class PassingFn {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] a){
        a[0]=100;
    }
}
