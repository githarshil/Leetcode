class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end  = s.length -1;
        while(start<end) {
            char last = s[start];
            s[start] = s[end];
            s[end] = last;
            start++;
            end--;
        }
    }
}