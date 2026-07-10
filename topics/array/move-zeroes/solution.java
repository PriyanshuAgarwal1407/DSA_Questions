class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int zeroesCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroesCount++;
            } else {
                ans.add(nums[i]);
            }
        }

        int index = 0;

        for (int num : ans) {
            nums[index++] = num;
        }
        while (zeroesCount-- > 0) {
            nums[index++] = 0;
        }
    }
}