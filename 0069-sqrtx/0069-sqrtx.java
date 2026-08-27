class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int root = 0;
        int ans = 0;
        if(x == 1) {
            return 1;
        }
        while(start<=end) {
            int mid  = start + (end -start)/2;
                if(isValid(x,mid)) {
                    ans  = mid;
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            
        }
        return ans;
    }
    public boolean isValid(int x,int mid) {
        long square = (long) mid * mid;
    return square <= x;
    }
}