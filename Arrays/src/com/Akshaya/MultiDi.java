package com.Akshaya;
import java.util.*;
public class MultiDi {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        //intialization
        //3 array list
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
        //multidimen array list output
    }
}
