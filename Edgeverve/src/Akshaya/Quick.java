package Akshaya;
import java.util.*;
public class Quick {
    static int partition(int[] arr,int l,int h){
        int pivot=arr[h];
        int i=l-1;
        for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[h]=temp;
        return i;
    }
    static void quick(int[] arr,int l,int h){
        if(l<h) {
            int pidx = partition(arr, l, h);
            quick(arr, l, pidx - 1);
            quick(arr, pidx + 1, h);
        }
    }
    public static void main(String[] args) {
        int[] arr={6,3,9,5,2,8};
        int n=arr.length;
        quick(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }
}
