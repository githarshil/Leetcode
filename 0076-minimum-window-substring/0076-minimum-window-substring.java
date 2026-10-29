class Solution {
    public String minWindow(String s, String t) {
        int[] need = new int[256];
        for(char c:t.toCharArray()) {
            need[c]++;
        }
        int low = 0;
        int len = 0;
        int res = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;
        int[] freq = new int[256];
        for(int high = 0;high<s.length();high++) {
            freq[s.charAt(high)]++;
            while(isValid(freq,need)) {
                len = high-low+1;
                if(res>len) {
                    res = len;
                    start = low;
                    end = high;
                }
                freq[s.charAt(low)]--;
                low++;
            }
        }
        if(res == Integer.MAX_VALUE) {
            return "";
        }
        return s.substring(start,end+1);
    }
    public boolean isValid(int[] freq,int[] need) {
        for(int i = 0;i<256;i++) {
            if(freq[i]<need[i]) {
                return false;
            }
        }
        return true;

    }
}