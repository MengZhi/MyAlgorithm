package com.company;

import javafx.util.Pair;
import java.util.*;
import java.util.regex.Pattern;


public class Main {

    public static final String EXAMPLE_TEST = "yes xxx is Yes xxx";

    public static void main(String[] args) {
        // write your code here
        //String pattern = "[yY]es.*";
        //System.out.println(EXAMPLE_TEST.matches(pattern));
        //List<String> res = generateParenthesis(3);
        //List<String> res2 = new ArrayList<>();
        //System.out.println(res);
        //int[] T = {1,2,1};
        //System.out.println(movesToMakeZigzag(T));
        //binaryTreePaths(root);
//        String input = "Date: tY-%1tm-te";
//        Calendar calendar = new GregorianCalendar(1995, GregorianCalendar.MAY, 23);
//        System.out.printf("%s did not match, " +" HINT: it was issued on %2$terd of some month", input, calendar);
//
//        System.out.printf(input + " did not match, " +" HINT: it was issued on %1$terd of some month", calendar);

        test3();

    }

    public static void test3() {

        System.out.println(new Long(3) == new Integer(1) + new Integer(2)); //t
        System.out.println(new Long(3).equals(new Integer(3)));
        System.out.println(new Long(3).equals(new Integer(1) + new Integer(2))); //f
    }

    public static void test2() {
        String t1 = "abc";
        String t2 = new String("abc");
        System.out.println(t1 == t2); //f
        System.out.println(t1.equals(t2)); //t
        System.out.println(t1 == t2.intern()); //t
        System.out.println(t1 == "abc"); // t
        System.out.println(t2 == "abc"); //f
    }

    public static void test1() {
        String t1 = "123\\d";
        String rt1 = t1.replaceAll("\\d", "456");
        String rt2 = t1.replaceAll(Pattern.quote("\\d"), "456");
        String rt3 = t1.replace("\\d", "456");
        System.out.println(rt1);
        System.out.println(rt2);
        System.out.println(rt3);
    }

    public static TreeNode initBinTree(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<TreeNode> treeNodeList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null)
                treeNodeList.add(new TreeNode(list.get(i)));
            else
                treeNodeList.add(new TreeNode(null));
        }

        int index = 0;
        queue.offer(treeNodeList.get(index));
        TreeNode res = queue.peek();
        index++;
        while (!queue.isEmpty() && index < treeNodeList.size()) {
            TreeNode qHead = queue.peek();
            TreeNode first = treeNodeList.get(index);
            TreeNode sec = index+1 < treeNodeList.size() ? treeNodeList.get(index+1) : new TreeNode(null);
            index += 2;

            if (first.val != null) {
                qHead.left = first;
                queue.offer(first);
            } else {
                qHead.left = null;
            }
            if (sec.val != null) {
                qHead.right = sec;
                queue.offer(sec);
            } else {
                sec.right = null;
            }
            queue.poll();
        }
        return res;
    }

    public TreeNode initBinTree2(List<Integer> list) {
        if (list.size() == 1) {
            return new TreeNode(list.get(0));
        }
        List<TreeNode> nodeList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            nodeList.add(new TreeNode(list.get(i)));
        }
        int temp = 0;
        int layers = (list.size() - 2) / 2;

        while (temp <= layers) { //注意这里，数组的下标是从零开始的
            if (2 * temp + 1 < list.size())
                if (nodeList.get(2 * temp + 1).val == -100) {
                    nodeList.get(temp).left = null;
                } else {
                    nodeList.get(temp).left = nodeList.get(2 * temp + 1);
                }
            if (2 * temp + 2 < list.size())
                if (nodeList.get(2 * temp + 2).val == -100) {
                    nodeList.get(temp).right = null;
                } else {
                    nodeList.get(temp).right = nodeList.get(2 * temp + 2);
                }
            temp++;
        }
        return nodeList.get(0);
    }

    public static int[][] testMap (int[][] position, int num) {
        Map<Pair<Integer, Integer>, Double> myMap = new TreeMap<>(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return 0;
            }
        });

        TreeMap<Integer, Double> m = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });


        for (int i=0; i<position.length; i++) {
            myMap.put(new Pair<>(position[i][0], position[i][1]), helper(position[i][0], position[i][1]));
        }

        int[][] res = new int[num][2];

        for (Map.Entry<Pair<Integer, Integer>, Double> it : myMap.entrySet()) {
            if (num-1 >= 0) {
                res[num-1][0] = it.getKey().getKey();
                res[num-1][1] = it.getKey().getValue();
                num--;
            }
        }
        return res;
    }

    public static double helper(int a, int b) {
        double res = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return res;
    }

    public static List<Integer> bSearch(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        //存放遍历结果，然后返回
        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();

            /*
            处理 TreeNode 节点 的逻辑
             */
            result.add(treeNode.val);


            if (treeNode.left != null) {
                queue.add(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.add(treeNode.right);
            }
        }
        return result;
    }

    public static void postOrderRe(TreeNode biTree) {
        if(biTree.left != null)
        {
            postOrderRe(biTree.left);
        }
        if(biTree.right != null)
        {
            postOrderRe(biTree.right);
        }
        System.out.println(biTree.val);
    }

    public static void midOrderRe(TreeNode biTree) {
        if(biTree.left != null)
        {
            midOrderRe(biTree.left);
        }
        System.out.println(biTree.val);
        if(biTree.right != null)
        {
            midOrderRe(biTree.right);
        }
    }


    public static void preOrderRe(TreeNode biTree)
    {//递归实现
        System.out.println(biTree.val);
        if(biTree.left != null)
        {
            preOrderRe(biTree.left);
        }
        if(biTree.right != null)
        {
            preOrderRe(biTree.right);
        }
    }


    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        if (root.left != null) {
            left = maxDepth(root.left);
        }
        if (root.right != null) {
            right = maxDepth(root.right);
        }
        return 1+Math.max(left, right);
    }

    public static String reverseW(String word) {
        StringBuilder sb = new StringBuilder(word);
        ArrayList<String> tempList = new ArrayList<>();
        int start=-1, end=-1;
        for (int i=0; i<sb.length(); i++) {
            if(Character.isUpperCase(sb.charAt(i)) || i == sb.length()-1) {
                if (start == -1) {
                    start = i;
                } else {
                    end = i;
                    if (i == sb.length()-1 && !Character.isUpperCase(sb.charAt(i))) {
                        end = i+1;
                    }
                    tempList.add(sb.substring(start, end));
                    start = i;
                }
            }
        }

        return null;
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i=0; i<nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int max = 0;
        int maxKey = -1;
        int start = -1;
        int end = nums.length;
        Set<Integer> maxSet = new HashSet<>();
        for(Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() > max) {
                max = it.getValue();
                maxKey = it.getKey();
            }
        }

        for(Map.Entry<Integer, Integer> it : map.entrySet()) {
            if (it.getValue() == max) {
                maxSet.add(it.getKey());
            }
        }
        int length = Integer.MAX_VALUE;
        for(int each:maxSet) {
            start = -1;
            end = nums.length;
            for (int i=0; i<nums.length; i++){
                if (nums[i] == each) {
                    if (start == -1) {
                        start = i;
                    } else {
                        end = i;
                    }
                }
            }
            if (start == -1) {
                start = 0;
            }
            if (end == nums.length) {
                end = nums.length-1;
            }
            if (length > end-start+1) {
                length = end-start+1;
            }
        }
        return length;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode hhead = res;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                hhead.next = l1;
                hhead = l1;
                l1 = l1.next;
            } else {
                hhead.next = l2;
                hhead = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            hhead.next = l1;
        } else {
            hhead.next = l2;
        }

        return res.next;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ArrayList<Integer> array = new ArrayList();
        while (l1 != null) {
            array.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            array.add(l2.val);
            l2 = l2.next;
        }
        array.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int res = o1.compareTo(o2);
                return res;
            }
        });

        ListNode res = new ListNode(0);
        ListNode head = res;
        for (int i=0; i<array.size(); i++) {
            res.next = new ListNode(array.get(i));
            res = res.next;
        }
        return head;
    }

    public static ListNode reverseList(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ArrayList<Integer> array = new ArrayList(head.val);
        head = head.next;
        while(head != null) {
            array.add(head.val);
            head = head.next;
        }
        ListNode hhead = new ListNode(0);
        ListNode res = hhead;
        for (int i=array.size()-1; i>=0; i--) {
            hhead.next = new ListNode(array.get(i));
            hhead = hhead.next;
        }
        return res.next;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode hhead = head;
        ListNode first = head;
        ListNode sec = head;

        for (int i=0; i<n; i++) {
            sec.next = sec.next.next;
        }

        while (sec.next != null) {
            sec.next = sec.next.next;
            first.next = first.next.next;
        }
        first.next = first.next.next;

        return hhead;
    }

    public static class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
     }

    public boolean detectCapitalUse(String word) {
        int up = 0;
        int low = 0;
        boolean firstIsUp = false;
        for (int i=0; i<word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                up ++;
            } else {
                low ++;
            }
        }
        if (up == word.length() || low == word.length()) {
            return true;
        }
        if (up == 1 && Character.isUpperCase(word.charAt(0))) {
            return true;
        }

        return false;
    }

    public static String reverseWordsIII(String s) {
        String[] strs = s.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            buffer.append(new StringBuffer(strs[i]).reverse().toString());
            buffer.append(" ");
        }
        return buffer.toString().trim();
    }

    public void reverseString(char[] s) {
        int first = 0;
        int last = s.length - 1;
        char temp;
        while (first <= last && first < s.length && last >= 0) {
            temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }
    }

    public String reverseStrII(String s, int k) {
        String res = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2 * k) {
            if (s.length() > 2 * k) {
                sb.append(new StringBuilder(s.substring(i, i + k)).reverse());
                sb.append(new StringBuilder(s.substring(i + k, i + 2 * k)));
            }
        }

        return res;
    }

    public String reverseStrII_Result(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i = i + 2 * k) {
            if (s.length() >= (i + k)) {
                sb.append(new StringBuilder(s.substring(i, i + k)).reverse());
            } else {
                sb.append(new StringBuilder(s.substring(i)).reverse());
                break;
            }

            if ((i + 2 * k) <= s.length()) {
                sb.append(s.substring(i + k, i + 2 * k));
            } else {
                sb.append(s.substring(i + k));
            }
        }
        return sb.toString();
    }


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList();
        String temp = "";
        DFS(result, temp, root);
        return result;
    }

    private static void DFS(List<String> res, String temp, TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            temp += root.val;
            res.add(temp);
            return;
        }
        temp += (root.val + "->");
        if(root.left != null) {
            DFS(res, temp, root.left);
        }
        if(root.right != null) {
            DFS(res, temp, root.right);
        }
    }

    public static int movesToMakeZigzag(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int resultW = 0;
        int resultM = 0;
        int left = 0;
        int right = 0;
        for (int i = 0; i < nums.length; i += 2) {
            left = i - 1 < 0 ? nums[0] : nums[i - 1];
            right = i + 1 >= nums.length ? left : nums[i + 1];
            if (nums[i] >= right || nums[i] >= left) {
                resultM += nums[i] - Math.min(left, right) + 1;
            }
        }
        for (int i = 1; i < nums.length; i += 2) {
            left = i - 1 < 0 ? nums[0] : nums[i - 1];
            right = i + 1 >= nums.length ? left : nums[i + 1];
            if (nums[i] >= right || nums[i] >= left) {
                resultW += nums[i] - Math.min(left, right) + 1;
            }
        }

        return Math.min(resultM, resultW);
    }

    public int movesToMakeZigzag2(int[] nums) {
        int n = nums.length;
        if (n == 1) {
            return 0;
        }

        int totalW = 0;
        int totalM = 0;
        for (int i = 0; i < n; i++) {
            int left = i - 1 >= 0 ? nums[i - 1] : nums[1];
            int right = i + 1 < n ? nums[i + 1] : left;
            if (left <= nums[i] || nums[i] >= right) {
                if (i % 2 != 0) {
                    totalW += nums[i] - Math.min(left, right) + 1;
                } else {
                    totalM += nums[i] - Math.min(left, right) + 1;
                }
            }
        }

        return Math.min(totalW, totalM);
    }

    public static int[] dalilyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            while (!stack.empty() && T[i] > T[stack.peek()]) {
                result[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return result;
    }

    public static int longestPalindromeSubseq(String s) {
        String result = "";
        String temp;
        for (int i = 0; i < s.length(); i++) {
            temp = helper(i, i, s);
            if (result.length() < temp.length()) {
                result = temp;
            }
            temp = helper(i, i + 1, s);
            if (result.length() < temp.length()) {
                result = temp;
            }
        }
        return result.length();
    }

    public static String helper(int first, int last, String s) {
        char[] carray = s.toCharArray();
        while (first >= 0 && last < s.length() && (carray[first] == carray[last])) {
            first--;
            last++;
        }
        return s.substring(first + 1, last);
    }


    public static boolean isPalinfrom(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (char c : s.toLowerCase().toCharArray()) {
//            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
//                sb.append(c);
//            }
//        }
//
//        String res2 = sb.reverse().toString();
//
//        return sb.toString().equals(res2);
        if (s == null) return true;
        s = s.toLowerCase();
        int l = s.length();
        StringBuilder str = new StringBuilder(l);
        for (char c : s.toCharArray()) {
            if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
                str.append(c);
            }
        }

        String res2 = str.reverse().toString();
        String res = str.toString();

//
        return res.toString().equals(res2);
//        return str.toString().equals(str.reverse().toString());
    }


    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        String solution = "";
        if (n > 0) {
            DFS(result, "", 0, 0, n);
        }
        return result;
    }

    private static void DFS(List<String> res, String solution, int left, int right, int n) {
        if (left == n && right == n) {
            res.add(solution);
            //solution = "";
        } else {
            if (left < n) {
                DFS(res, solution + "(", left + 1, right, n);
            }
            if (left > right) {
                DFS(res, solution + ")", left, right + 1, n);
            }
        }
    }
}
