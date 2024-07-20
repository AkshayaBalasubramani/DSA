package com.Akshaya;

public class Main {
    public static void main(String[] args){
        int sal=2300;

        //if else
//        int new_sal;
//        if(sal>10000){
//            new_sal=sal+2000;
//        }
//        else{
//            new_sal=sal+1000;
//        }


        //multiple if else
        if(sal>10000)
            sal+=2000;
        else if(sal<1000)
            sal+=100;
        else
            sal+=1000;
        System.out.println("new sal="+sal);
    }
}
