package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution3lengthOfLongestSubstringTest {

    @Test
    public void lengthOfLongestSubstring() {
        Solution3lengthOfLongestSubstring solution3lengthOfLongestSubstring = new Solution3lengthOfLongestSubstring();
        String input = "pwwkew";
        Assert.assertEquals(solution3lengthOfLongestSubstring.lengthOfLongestSubstring(input), 3);
    }
}