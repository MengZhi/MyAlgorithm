package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution0808PermutationIILCCITest {

    @Test
    public void permutation() {
        String S = "qqe";
        String[] exp = {"eqq","qeq","qqe"};
        String[] res = Solution0808PermutationIILCCI.permutation(S);
        Assert.assertEquals(res.length, 3);
    }
}