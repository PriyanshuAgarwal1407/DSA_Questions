class Solution {
    public int[] searchRange(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1, last = -1;

        while(low<=high){
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        low = 0;
        high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{first, last};
    }
}