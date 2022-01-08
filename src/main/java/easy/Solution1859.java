package easy;

/*
1859. Sorting the Sentence
https://leetcode.com/problems/sorting-the-sentence/
 */
class Solution1859 {
    public String sortSentence(String str) {
        String[] split = str.split(" ");
        String[] result = new String[split.length];

        for (String s : split) {
            int endIndex = s.length() - 1;
            int index = Integer.parseInt(s.substring(endIndex));
            result[index - 1] = s.substring(0, endIndex);
        }

        return String.join(" ", result);
    }
}