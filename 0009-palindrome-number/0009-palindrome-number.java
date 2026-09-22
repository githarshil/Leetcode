class Solution {
    public boolean isPalindrome(int x) {
        // int res = Math.abs(x);
        char[] str = Integer.toString(x).toCharArray();
        int start = 0;
        int end = str.length - 1;
        while (start <= end) {
            if (str[start] == str[end]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}