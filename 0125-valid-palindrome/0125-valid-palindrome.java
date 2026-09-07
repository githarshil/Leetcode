class Solution {
    public boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        int first = 0;
        int last = str.length() - 1;
        String low = str.toLowerCase();
        while (first < last) {
            if (low.charAt(first) != low.charAt(last)) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}