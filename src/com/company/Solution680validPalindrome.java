package com.company;

public class Solution680validPalindrome {
    public boolean validPalindrome(String s) {

        int start = 0;
        int end = s.length()-1;
        boolean first = true;
        boolean second = true;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                for (int i=start+1, j = end; i<j; i++, j--) {
                    if (s.charAt(i) == s.charAt(j)) {
                        continue;
                    } else {
                        first = false;
                        break;
                    }
                }
                for (int i=start, j = end-1; i<j; i++, j--) {
                    if (s.charAt(i) == s.charAt(j)) {
                        continue;
                    } else {
                        second = false;
                        break;
                    }
                }
                return first || second;
            }
        }
        return true;
    }
}
