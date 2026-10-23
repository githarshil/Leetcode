class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];
        for(char c : s.toCharArray()) {
            freq[c]++;
        }
        int count = 0;
        boolean odd = false;
        for(int  i = 0;i<freq.length;i++) {
            int num = freq[i];
            if(num%2 == 0) {
                count+=num;
            }
            else {
                odd = true;
            }
        }
        if(odd == true) {
            for(int  i = 0;i<freq.length;i++) {
                int val = freq[i];
                if(val%2 == 1) {
                    count+=val-1;
                }
            }
            return count+1;
        }
        return count;
    }
}