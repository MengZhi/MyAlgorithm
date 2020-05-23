/**
 * 求解一个给定的方程，将x以字符串"x=#value"的形式返回。该方程仅包含'+'，' - '操作，变量 x 和其对应系数。
 *
 * 如果方程没有解，请返回“No solution”。
 *
 * 如果方程有无限解，则返回“Infinite solutions”。
 *
 * 如果方程中只有一个解，要保证返回值 x 是一个整数。
 *
 * 示例 1：
 *
 * 输入: "x+5-3+x=6+x-2"
 * 输出: "x=2"
 * 示例 2:
 *
 * 输入: "x=x"
 * 输出: "Infinite solutions"
 * 示例 3:
 *
 * 输入: "2x=x"
 * 输出: "x=0"
 * 示例 4:
 *
 * 输入: "2x+3x-6x=x+2"
 * 输出: "x=-1"
 * 示例 5:
 *
 * 输入: "x=x+2"
 * 输出: "No solution"
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/solve-the-equation
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

package com.company;


import com.sun.tools.javac.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class Solution640 {


    public static String solveEquation(String equation) {
        String[] leftRight = equation.split("=");
        List<String> left = seprate(leftRight[0]);
        List<String> right = seprate(leftRight[1]);
        int leftNum = 0;
        int rightNum = 0;
        for (String each : left) {
            if (each.indexOf('x') >= 0) {
                leftNum += Integer.parseInt(getPrefixNum(each));
            } else {
                rightNum -= Integer.parseInt(each);
            }
        }

        for (String each : right) {
            if (each.indexOf('x') >= 0) {
                leftNum -= Integer.parseInt(getPrefixNum(each));
            } else {
                rightNum += Integer.parseInt(each);
            }
        }
        if (leftNum == 0) {
            if (rightNum == 0)
                return "Infinite solutions";
            else
                return "No solution";
        }

        return "x=" + rightNum/leftNum;
    }

    private static List<String> seprate(String input) {
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        for (int i=0; i<input.length(); i++) {
            if (isPos(input.charAt(i)) || isNeg(input.charAt(i))) {
                if (temp.length() > 0) {
                    res.add(temp.toString());
                    temp = new StringBuilder();
                }
                temp.append(input.charAt(i));
            } else {
                temp.append(input.charAt(i));
            }
        }
        res.add(temp.toString());
        return res;
    }

    private static boolean isNeg(char input) {
        return input == '-';
    }

    private static boolean isPos(char input) {
        return input == '+';
    }

    private static String getPrefixNum (String input) {
        if (input.length()>1 && input.charAt(input.length()-2) >= '0' && input.charAt(input.length()-2) <= '9') {
            return input.replace("x", "");
        } else {
            return input.replace("x", "1");
        }
    }











    public static String coeff(String x) {
        if (x.length() > 1 && x.charAt(x.length() - 2) >= '0' && x.charAt(x.length() - 2) <= '9')
            return x.replace("x", "");
        return x.replace("x", "1");
    }
    public static String solveEquation2(String equation) {
        String[] lr = equation.split("=");
        int lhs = 0, rhs = 0;
        for (String x: breakIt(lr[0])) {
            if (x.indexOf("x") >= 0) {
                lhs += Integer.parseInt(coeff(x));
            } else
                rhs -= Integer.parseInt(x);
        }
        for (String x: breakIt(lr[1])) {
            if (x.indexOf("x") >= 0)
                lhs -= Integer.parseInt(coeff(x));
            else
                rhs += Integer.parseInt(x);
        }
        if (lhs == 0) {
            if (rhs == 0)
                return "Infinite solutions";
            else
                return "No solution";
        }
        return "x=" + rhs / lhs;
    }
    public static List < String > breakIt(String s) {
        List < String > res = new ArrayList < > ();
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (r.length() > 0)
                    res.add(r);
                r = "" + s.charAt(i);
            } else
                r += s.charAt(i);
        }
        res.add(r);
        return res;
    }
}
