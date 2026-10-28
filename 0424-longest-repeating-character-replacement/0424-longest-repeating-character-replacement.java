class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0;
        int result = -1;
        int[] freq = new int[256];
        for( int high = 0; high < s.length(); high++) {
            freq[s.charAt(high)]++;
            int len = high - low+1;
            int maxfreq = find(freq);
            int diff = len-maxfreq;
            while(diff>k) {
                freq[s.charAt(low)]--;
                low++;
                maxfreq = find(freq);
                len = high-low+1;
                diff = len-maxfreq;
            }
            len = high-low+1;
            result = Math.max(result,len);
        }
        return result;
    }
    public int find(int[] arr) {
        int max = -1;
        for(int i = 0;i < arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}