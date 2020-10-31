package com.company;

public class Solution208Trie {
    class TrieNode {
        public TrieNode[] link = new TrieNode[26];
        public boolean isEnd = false;
        public boolean consist(char ch) {
            return link[ch - 'a'] != null;
        }
        void put(char ch) {
            link[ch - 'a'] = new TrieNode();
        }
        TrieNode get(char ch) {
            return link[ch - 'a'];
        }
    }

    TrieNode root;


    /** Initialize your data structure here. */
    public Solution208Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode temp = root;
        for (int i=0; i<word.length(); i++) {
            char curr = word.charAt(i);
            if (!temp.consist(curr)) {
                temp.put(curr);
            }
            temp = temp.get(curr);
        }
        temp.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = searchPrifix(word);

        return node != null && node.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return searchPrifix(prefix) != null;
    }

    private TrieNode searchPrifix (String word) {
        TrieNode temp = root;
        for (int i=0; i<word.length(); i++) {
            if (!temp.consist(word.charAt(i))) {
                return null;
            } else {
                temp = temp.get(word.charAt(i));
            }
        }
        return temp;
    }
}
