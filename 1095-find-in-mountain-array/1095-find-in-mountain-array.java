/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        int mid = 0;
        while(start<end) {
            mid = start + (end-start)/2;
            if(mountainArr.get(mid)>mountainArr.get(mid+1)) {
                end = mid;
            }
            else if(mountainArr.get(mid)<mountainArr.get(mid+1)) {
                start = mid +1;
            }
        }
        int peak = start;
            start = 0;
            end = peak;
            while(start<=end){
                mid = start + (end-start)/2;
                if(target>mountainArr.get(mid)) {
                    start = mid + 1;
                }
                else if(target<mountainArr.get(mid)){
                    end = mid -1;
                }
                else return mid;
            }
            start = peak;
            end = mountainArr.length()-1;
            while(start<=end){
                mid = start + (end-start)/2;
                if(target<mountainArr.get(mid)) {
                    start = mid + 1;
                }
                else if(target>mountainArr.get(mid)){
                    end = mid -1;
                }
                else return mid;
            }
            return -1;
    }
}