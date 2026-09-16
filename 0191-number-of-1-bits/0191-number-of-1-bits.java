class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        String bstr = Integer.toBinaryString(n);
        for(int i=0;i<bstr.length();i++) {
            if((bstr.charAt(i)&1) == 1){
                count++;
            }
        }
    return count;
    }
}