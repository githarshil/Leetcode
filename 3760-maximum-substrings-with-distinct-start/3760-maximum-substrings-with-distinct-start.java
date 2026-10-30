class Solution {
    public int maxDistinct(String s) {
        Map <Character,Integer> freq = new HashMap<>();
        // int[] freq = new int[256];
        for(char c: s.toCharArray()) {
            freq.put(c,freq.getOrDefault(c,0) + 1);
        }
        return freq.size();
    }
}