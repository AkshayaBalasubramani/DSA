package com.Akshaya;
import java.util.*;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        //.trim removes the spaces
        //charAt the index starts from 0-the particular index value is output
        if(ch>='a'&&ch<='z'){
            System.out.println("lower case");
        }
        else{
            System.out.println("upper case");
        }
        System.out.println(ch);
        //we can use even the ascii values
    }
}
