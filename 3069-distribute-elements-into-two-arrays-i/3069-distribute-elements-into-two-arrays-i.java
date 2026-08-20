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
        int[] result = new int[count1 + 1 + count2 + 1];
        int idx = 0;
        for (int k = 0; k <= count1; k++) {
            result[idx++] = arr1[k];
        }
        for (int k = 0; k <= count2; k++) {
            result[idx++] = arr2[k];
        }
        return result;
    }
}