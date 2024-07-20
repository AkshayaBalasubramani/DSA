package Akshaya;
import java.util.* ;
import java.io.*;
public class R90_rotate{
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        inplaceRotate(arr,3);
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
    static void inplaceRotate(int[][] arr, int n) {
        // transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
        //reverse
        for(int i=0;i<(n/2);i++){
            for(int j=0;j<n;j++){
                int t=arr[i][j];
                arr[i][j]=arr[n-i-1][j];
                arr[n-i-1][j]=t;
            }
        }
    }
}

