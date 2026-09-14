class Solution {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() -1;
        while(start<=end) {
            if(s.charAt(start) == s.charAt(end)){
                start++;
                end--;
            }
            // delete left 
            else if (isValid(s,start+1,end)) {
                return true;
            } 
            // delete right
            else if(isValid(s,start,end-1)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
    public boolean isValid(String s, int start, int end) {
        while(start<=end) {
            if(s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}