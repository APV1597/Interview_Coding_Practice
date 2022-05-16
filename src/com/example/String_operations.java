package com.example;

import java.util.Scanner;

public class String_operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1= scan.next();
        System.out.println("Enter the second string");
        String s2= scan.next();
        int a= s1.length();
        int b= s2.length();
        int c=a+b;
        System.out.println("The length of both strings is" + c);
        if(s1.compareToIgnoreCase(s2)>0)
            System.out.println("Yes");
        else if (s1.compareToIgnoreCase(s2)<0) {
            System.out.println("No");
        }
        String caps=s1.substring(0,1);
        caps= caps.toUpperCase();
        String rem = s1.substring(1,s1.length());
        String r1= caps+rem;


        String caps1=s2.substring(0,1);
        caps1= caps1.toUpperCase();
        String rem1 = s2.substring(1,s2.length());
        String r2= caps1+rem1;
        System.out.println("The resultant string is "+ r1 + r2);



    }


}
