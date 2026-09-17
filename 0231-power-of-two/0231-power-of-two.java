class Solution {
    public boolean isPowerOfTwo(int n) {
        long n1 = n;
        if(n1==0) {
            return false;
        }
        else if((n1 & (n1 - 1)) == 0){
            return true;
        }
        return false;
    }
}