class Solution {
    public int hIndex(int[] citations) {
        int start = 0;
        int end = citations.length;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(isValid(citations,mid)){
                ans = mid;
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }
    private boolean isValid(int[] arr, int mid){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] >= mid){
                count++;
            }
        }
        return count>=mid;
    }
}