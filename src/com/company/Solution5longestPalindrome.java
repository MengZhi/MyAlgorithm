package com.company;

public class Solution5longestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() == 0 || s == null) {
            return "";
        }
        int start = 0;
        int end = 0;

        for (int i=0; i<s.length(); i++) {
            int len1 = palindromeLength(i, i, s);
            int len2 = palindromeLength(i, i+1, s);
            int maxLen = Math.max(len1, len2);

            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    int palindromeLength(int start, int end, String s) {
        int left = start;
        int right = end;

        while (left >=0 && right< s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right-left-1;
    }
}
