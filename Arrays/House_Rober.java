class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n < 2) {
            return nums[0];
        }

        int max = 0;
        int[] loot = new int[n];
        loot[0] = nums[0];
        loot[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            loot[i] = Math.max(loot[i - 1], loot[i - 2] + nums[i]);
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(max, loot[i]);
        }

        return max;
    }
}