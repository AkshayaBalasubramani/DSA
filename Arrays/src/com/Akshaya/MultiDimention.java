package com.Akshaya;
import java.util.*;
public class MultiDimention {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*   1 2 4
             3 4 5
             6 7 8
         */
        int[][] arr=new int[3][2];//no of cols need not be specified
        //row cols

        //direct storage
        int[][] arr1={
                {1,2,3},
                {4,5},
                {7,7,8,9}
        };
        //length of rows=arr.length foves no of rows
        //input-for loop fot individual arrays
        for(int i=0;i<arr.length;i++){
            //each col
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        //output
        //matrix like form
        for(int i=0;i<arr.length;i++){
            //each col
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //enhanced using
        for(int row=0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
        //enhanced for loop
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
