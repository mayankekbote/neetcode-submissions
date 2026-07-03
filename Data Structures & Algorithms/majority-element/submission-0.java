class Solution {
    public int majorityElement(int[] nums) {
        int majorityEle = nums[0];
        int count = 0;
        int maxCount = 0;
        for(int num:nums){
            if(num == majorityEle) count++;
            else count--;

            if(count < 0) {
                count = 0;
                majorityEle = num;
            }
    
        }

        return majorityEle;
    }
}