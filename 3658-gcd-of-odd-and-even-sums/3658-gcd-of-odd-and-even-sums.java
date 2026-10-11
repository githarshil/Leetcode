class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd = n*(n+1);
        int sumeven = n*n;
        return gcd(sumodd,sumeven);
    }
    static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}
}