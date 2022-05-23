package com.example;

import java.util.Scanner;

public class Numberrev {

    public static boolean isPalindrome(int x) {
        String s= String.valueOf(x);
        char [] arr = s.toCharArray();
        String rev="";
        for(int i=arr.length-1;i>=0;i--)
        {
            rev= rev+ arr[i];
        }
        return s.equals(rev);
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the number");
        int x= scan.nextInt();
        System.out.println(isPalindrome(x));
    }
}
