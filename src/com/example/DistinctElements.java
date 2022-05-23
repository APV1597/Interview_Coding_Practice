package com.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class DistinctElements {
    public static int removeDuplicates(int[] nums) {
        Set<Integer> set= new HashSet<>();
        for(Integer i: nums)
        {
            set.add(i);
        }
        System.out.println(set);
        return set.size();

    }
        public static void main (String[]args){
        int[] nums ={0,0,1,1,1,2,2,3,3,4};
            System.out.println(removeDuplicates(nums));
        }
    }
