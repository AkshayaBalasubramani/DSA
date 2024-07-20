package com.Akshaya;
//the largest 3 no's and check the largest number
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a,b,c;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

//        if((a>b)&&(a>c)){
//            System.out.println(a+" is the greatest");
//        }
//        else if((b>a)&&(b>c)){
//            System.out.println(b+" is the largest");
//        }
//        else{
//            System.out.println(c+" is the greatest");
//        }

//         int max=a;
//         if(b>max)
//             max=b;
//         if(c>max)
//             max=c;
//        System.out.println("max="+max);

        //there are many ways to solve a particular problem
        int max=Math.max(c,Math.max(b,a));
        System.out.println("max value:"+max);
    }
}
