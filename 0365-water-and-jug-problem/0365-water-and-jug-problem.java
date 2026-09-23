class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        return target <= x + y && target % gcd(x, y) == 0;
    }

    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b); // careful — order matters, see below
    }
}