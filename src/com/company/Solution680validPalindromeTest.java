package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution680validPalindromeTest {

    @Test
    public void validPalindrome() {
        Solution680validPalindrome solution680validPalindrome = new Solution680validPalindrome();
        Assert.assertEquals(solution680validPalindrome.validPalindrome("eedede"), true);
    }
}