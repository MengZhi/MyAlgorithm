/**
 * Write a method to compute all permutations of a string whose charac­ ters are not necessarily unique. The list of permutations should not have duplicates.
 *
 * Example1:
 *
 *  Input: S = "qqe"
 *  Output: ["eqq","qeq","qqe"]
 * Example2:
 *
 *  Input: S = "ab"
 *  Output: ["ab", "ba"]
 * Note:
 *
 * All characters are English letters.
 * 1 <= S.length <= 9
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutation-ii-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

package com.company;

import com.company.Util.MapUtil;

import java.util.*;

public class Solution0808PermutationIILCCI {

    public static String[] permutation(String S) {
        Map<Character, Integer> helperMap = new HashMap<>();

        List<String> stringList = new ArrayList<>();

        for (int i=0; i<S.length(); i++) {
            if (helperMap.containsKey(S.charAt(i))) {
                helperMap.put(S.charAt(i), helperMap.get(S.charAt(i))+1);
            } else {
                helperMap.put(S.charAt(i), 1);
            }
        }


        DFS(S, stringList, new StringBuilder(), helperMap);
        String[] result =stringList.toArray(new String[stringList.size()]);
        return result;
    }

    private static void DFS(String S, List<String> stringList,  StringBuilder temp, Map<Character, Integer> map) {
        if (temp.length() == S.length()) {
            stringList.add(new String(temp));
        } else {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() <= 0) {
                    continue;
                }
                entry.setValue(entry.getValue()-1);
                temp.append(entry.getKey());
                DFS(S, stringList, temp, map);
                temp.deleteCharAt(temp.length()-1);
                entry.setValue(entry.getValue()+1);
            }
        }
    }

}


















