class Solution {
    public boolean validMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length-1;
            boolean increasing = true;
            boolean decreasing = true;
            int max_index = 0;
            int max_val = arr[0];
        if(arr.length>=3) {
            for(int i = 0;i<arr.length;i++) {
                if(arr[i]>max_val) {
                    max_val = arr[i];
                    max_index = i;
                }
            }
            if(max_index == 0 || max_index == arr.length-1) {
                return false;
            }
            for (int j = start;j<max_index;j++) {
                if(arr[j]>=arr[j+1]) {
                    increasing  =  false;
                }
            }
            for (int k = end;k>max_index;k--) {
                if(arr[k]>=arr[k-1]) {
                    decreasing  =  false;
                }
            }
        }
        if (arr.length<3) {
            return false;
        }
        if(increasing == true && decreasing == true) {
            return true;
        } else {
            return false;
        }
    }
}