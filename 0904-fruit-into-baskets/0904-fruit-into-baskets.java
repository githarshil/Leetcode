class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int result = -1;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int high = 0; high < fruits.length; high++) {
            freq.put(fruits[high], freq.getOrDefault(fruits[high], 0) + 1);
            while (freq.size() > 2) {
                freq.put(fruits[low], freq.get(fruits[low]) - 1);
                if (freq.get(fruits[low]) == 0) {
                    freq.remove(fruits[low]);
                }
                low++;
            }
            int len = high - low + 1;
            result = Math.max(result,len);
        }
        return result;
    }
}