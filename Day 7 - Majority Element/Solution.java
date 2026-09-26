class Solution {
    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        int num = nums[0];
        int count = 1;
        int max = 1;
        int max_num = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (num == nums[i]) {
                count++;

                if (count > max) {
                    max = count;
                    max_num = nums[i];
                }
            } 
            else {
                num = nums[i];
                count = 1;
            }
        }

        return max_num;
    }
}
