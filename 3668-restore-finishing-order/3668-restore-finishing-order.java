class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] res = new int[friends.length];
        Set<Integer> seen =  new HashSet<>();
        for(int x : friends) {
            seen.add(x);
        }
        int i = 0;
        for(int y : order) {
            if(seen.contains(y)) {
                res[i]=y;
                i++;
            }
        }
        return res;
    }
}