class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int i = 0;
        int count = 0;
        for(i = 0;i<startTime.length;i++) {
                if(queryTime >= startTime[i] && queryTime<=endTime[i]) {
                    count++;
                }
        }
        return count;
    }
}