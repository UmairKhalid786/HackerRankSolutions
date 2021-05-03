package com.techlads.interviewprolems.hackerrank;

import java.util.List;

public class FindTheNumber {

    static public String findNumber(List<Integer> arr, int k) {
        String answer = "NO";
        for (Integer n : arr) {
            if (n == k) {
                answer = "YES";
                break;
            }
        }
        return answer;
    }
}
