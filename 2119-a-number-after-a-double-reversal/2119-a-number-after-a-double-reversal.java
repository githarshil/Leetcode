class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev = 0;
        int rev2 = 0;
        int res = num;
        while (num!=0) {
        int last = num%10;
        num = num/10;
        rev = rev*10+last;
        }
        while (rev!=0) {
        int last2 = rev%10;
        rev = rev/10;
        rev2 = rev2*10+last2;
        }
        if(res==rev2) {
            return true;
        }
        return false;
    }
}