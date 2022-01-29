package easy;

class Solution2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String sentence : sentences) {
            max = Math.max(max, sentence.length() - sentence.replace(" ", "").length());
        }

        return max + 1;
    }
}