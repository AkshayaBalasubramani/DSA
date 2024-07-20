package com.Akshaya;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean a1=true;
        while(a1==true){
            System.out.println("enter operator:");
            char op=sc.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%')
            {
            System.out.println("input nos");
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%') {
                System.out.println("valid");
                if (op == '+')
                    System.out.println("sum=" + (a + b));
                if (op == '-')
                    System.out.println("diff=" + (a - b));
                if (op == '*')
                    System.out.println("pdt=" + (a * b));
                if (op == '/')
                    System.out.println("div=" + (a / b));
                if (op == '%')
                    System.out.println("rem=" + (a % b));
            }
                else if(op=='X'||op=='x') {
                    a1=false;
                    break;
                }
                else
                    System.out.println("wrong operator");


            }

        }
    }
}
