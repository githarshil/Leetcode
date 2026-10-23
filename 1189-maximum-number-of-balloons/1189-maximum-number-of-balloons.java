class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq = new int[26];
        for(char c:text.toCharArray()) {
            freq[c-'a']++;
        }
        String target = "balloon";
        int[] freqt = new int[26];
        for(char c:target.toCharArray()) {
            freqt[c-'a']++;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0;i<freqt.length;i++) {
            int need = freqt[i];
            int have  = freq[i];
            if(need == 0) {
                continue;
            }
            int times  = have/need;
            res = Math.min(res,times);
        }
        return res;
    }
}