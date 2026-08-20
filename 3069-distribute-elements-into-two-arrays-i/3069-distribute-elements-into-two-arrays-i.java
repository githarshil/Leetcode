class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        arr1[0] = nums[0];
        int count1 = 0;
        arr2[0] = nums[1];
        int count2 = 0;
        for (int i = 2; i < nums.length; i++) {
            if (arr1[count1] > arr2[count2]) {
                count1++;
                arr1[count1] = nums[i];
            } else {
                count2++;
                arr2[count2] = nums[i];
            }
        }
        int[] result = IntStream.concat(
                Arrays.stream(arr1, 0, count1 + 1), // only the USED portion
                Arrays.stream(arr2, 0, count2 + 1)).toArray();
        return result;
    }
}