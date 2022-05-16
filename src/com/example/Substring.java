package com.example;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();

        System.out.println(getSmallestAndLargest(s, k));


    }

    public static String getSmallestAndLargest(String s, int k) {
        String current_string = s.substring(0,k);
        String smallest=current_string;
        String largest= current_string;
        for(int i=1;i<=s.length()-k;i++)
        {
            current_string=s.substring(i,i+k);
            if(current_string.compareToIgnoreCase(largest)>0)
            {
                largest=current_string;
            } else if (current_string.compareToIgnoreCase(smallest)<0) {
                smallest=current_string;

            }
        }
return smallest + "\n" + largest ;

    }

}


