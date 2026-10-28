class Solution {
    public int maxVowels(String s, int k) {
        int low = 0;
        int high = k - 1;
        int sum = 0;
        int max = 0;

        for (int i = low; i <= high; i++) {
            if (isVowel(s.charAt(i))) {
                sum++;
                }
        }
        max = sum;

        while (high < s.length() - 1) {
            low++;
            high++;
            if (isVowel(s.charAt(high))) {sum++;}
            if (isVowel(s.charAt(low - 1))) {sum--;}
            max = Math.max(sum, max);
            if (max == k) return k;
        }
        return max;
    }

    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}