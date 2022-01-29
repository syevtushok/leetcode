package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/*
211. Design Add and Search Words Data Structure
https://leetcode.com/problems/design-add-and-search-words-data-structure/
 */
public class WordDictionary211 {
    Map<Integer, List<String>> list;

    public WordDictionary211() {
        list = new HashMap<>();
    }

    public void addWord(String word) {
        List<String> strings = list.getOrDefault(word.length(), new ArrayList<>());
        strings.add(word);
        list.put(word.length(), strings);
    }

    public boolean search(String word) {
        List<String> strings = list.get(word.length());
        if (strings == null) {
            return false;
        }

        for (String string : strings) {
            if (Pattern.matches(word, string)) {
                return true;
            }
        }

        return strings.contains(word);
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */