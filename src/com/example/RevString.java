package com.example;

import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = scan.next();
        char a[]= s.toCharArray();
        String rev=" ";
        for(int i=a.length-1;i>=0;i--)
        {
            rev= rev+ a[i];
        }
        System.out.println("The reverse of string is" + rev);

    }





}
