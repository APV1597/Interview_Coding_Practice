package com.example;

import java.util.Scanner;

public class Anagrams_FreqTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean t =isAnagram(a, b);
        System.out.println((t)?"Anagrams":"Not Anagrams");


    }

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            System.out.println(false);

        }
        int[] char_freq = new int[26]; //Create a frequency table with 26 characters
        for (int i = 0; i < a.length(); i++) {
            char current = a.charAt(i);
            int index = current - 'a'; //Subtract the ASCII value from a
            char_freq[index]++;
        }
        for (int i = 0; i < b.length(); i++) {
            char current = b.charAt(i);
            int index = current - 'a';
            char_freq[index]--; // Incrementing and decrementing to find out the frequency
        }
        for(int i=0;i<26;i++)
        {
            if(char_freq[i]!=0)
                return false;
        }
        return true;
    }




}
