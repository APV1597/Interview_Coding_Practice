package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class anagrams {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    boolean ret = isAnagram(a, b);
        System.out.println((ret)?"Anagrams":"Not Anagrams");
}
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a=a.toLowerCase(); //Convert both strings to lowercase
        b=b.toLowerCase();
        char[] first = a.toCharArray(); //Convert string to character array for sorting
        char[] second = b.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second); //Compare both arrays
        }

    }


