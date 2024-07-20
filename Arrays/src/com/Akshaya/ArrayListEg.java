package com.Akshaya;
import java.util.ArrayList;
import java.util.*;
public class ArrayListEg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(2);//constructor
        //in the above value write wrapper class not primitives
        list.add(67);
        list.add(56);
        list.add(100);
        list.add(10);
        list.add(2);
        //any no of values can be added
        //need not do arrays.toString
        //directly calls toString

        //various function are associated with ArrayList
        System.out.println(list.contains(100));
        System.out.println(list.contains(1));
        System.out.println(list);

        //change or update values
        list.set(0,99);//-0th index
        System.out.println(list);

        list.remove(2);//removes 2nd index value
        System.out.println(list);

        //add values to existing arrayList
        for(int i=0;i<5;i++){
            list.add(i);
        }
        System.out.println(list);

        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here
            //list of index syntax wont work here
        }
    }
}
