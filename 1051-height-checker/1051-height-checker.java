class Solution {
    public int heightChecker(int[] heights) {
        int[] exp = Arrays.copyOf(heights, heights.length);
        Arrays.sort(exp);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < heights.length && j < heights.length) {
            if (heights[i] != exp[j]) {
                count++;
            }
            i++;
            j++;
        }
        return count;
    }
}