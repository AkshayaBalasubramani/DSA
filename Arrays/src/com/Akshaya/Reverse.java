package com.Akshaya;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        rev(arr,n);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr,int no){
        int[] n=new int[no];
        int j=0;
        for(int i=no-1;i>=0;i--){
            n[j]=arr[i];
            j++;
        }
        for(int i=0;i<no;i++){
            arr[i]=n[i];
        }
    }

}
