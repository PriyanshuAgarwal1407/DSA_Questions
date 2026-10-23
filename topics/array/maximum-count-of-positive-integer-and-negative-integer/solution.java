class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int low=0, high=n-1, neg=n;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] >=0) {
                neg = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

        low=0;
        high=n-1;
        int pos=n;

        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]>0){
                pos = mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

        pos = n - pos;
        return Math.max(neg,pos);
    }
}