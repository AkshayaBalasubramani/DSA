package com.Akshaya;
import java.util.*;
public class RevAd {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int s=0;
        int e=arr.length-1;
        while(!(s>=e))
        {
            swap(arr,s,e);
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int s,int e){
        int t=arr[s];
        arr[s]=arr[e];
        arr[e]=t;
    }
}
