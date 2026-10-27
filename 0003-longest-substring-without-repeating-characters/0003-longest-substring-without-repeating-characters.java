class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low = 0;
        int result = 0;
        Map<Character, Integer> freq = new HashMap<>();
        for (int high = 0; high < s.length(); high++) {
            freq.put(s.charAt(high), freq.getOrDefault(s.charAt(high), 0) + 1);
            int k = high - low + 1;
            while (freq.size() < k) {
                freq.put(s.charAt(low), freq.get(s.charAt(low)) - 1);
                if (freq.get(s.charAt(low)) == 0) {
                    freq.remove(s.charAt(low));
                }
                low++;
                k = high - low +1;
            }
            int len = high - low + 1;
            result = Math.max(result,len);
        }
        return result;
    }
}