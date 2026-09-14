class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] result = new char[word1.length() + word2.length()];
        int j = 0;
        int k = 0;
        int i = 0;
        boolean turn = true;
        while (i < result.length) {
            if (j < word1.length() && turn == true) {
                result[i] = word1.charAt(j);
                j++;
                turn = false;
            } else if (k < word2.length() && turn == false) {
                result[i] = word2.charAt(k);
                k++;
                turn = true;
            } else if (j < word1.length() || k < word2.length()) {
                if (j < word1.length()) {
                    result[i] = word1.charAt(j);
                    j++;
                } else {
                    result[i] = word2.charAt(k);
                    k++;
                }
            }
            i++;
        }
        String str = String.valueOf(result);
        return str;
    }
}