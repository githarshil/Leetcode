class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int max = -1;
        int min  = bloomDay[0];
        int ans = 0;
        if((long) m*k>bloomDay.length){
            return -1;
        }
        for(int i = 0;i<bloomDay.length;i++){
            if(bloomDay[i]>max){
                max = bloomDay[i];
            } if(bloomDay[i]<min) {
                min = bloomDay[i];
            }
        }
        int start= min;
        int end = max;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isValid(bloomDay,mid,m,k)){
                ans = mid;
                end  =  mid-1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    private boolean isValid(int[] bloomDay, int mid, int m , int k){
        int counter = 0;
        int bouqet = 0;
        for(int i = 0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                counter++;
            } else {
                bouqet += counter/k;
                counter =0;
            }
        }
        bouqet += counter/k;
        return bouqet>=m;
    }
}