class Solution {
    public boolean isPerfectSquare(int num) {
        long start = 0;
        long end = num;
        long ans = -1;
        while(start<=end) {
            long mid = start + (end-start)/2;
            if(isValid(num,mid)){
                ans = mid;
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return ans*ans==num;
    }
    private boolean isValid(long num, long mid) {
        return mid*mid>=num;
    }
}