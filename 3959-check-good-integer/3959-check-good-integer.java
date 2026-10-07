class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int square = 0;
        while(n!=0) {
            int last = n%10;
            n = n/10;
            sum+=last;
            square+=last*last;
        }
        if(square - sum >= 50) {
            return true;
        }
        return false;
    }
}