package com.Akshaya;
public class MaxItem {
    public static void main(String[] args) {
        int[] arr={10,20,15,30,40,100};
        int max=maxi(arr);
        int m=maxRange(arr,0,2);
        System.out.println("out="+max);
        System.out.println("outp="+m);
    }
    static int maxi(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int m=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m){
                m=arr[i];
            }
        }
        return m;
    }
    static int maxRange(int[] arr,int start,int stop){
        int max=arr[start];
        for(int i=start;i<=stop;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
}
