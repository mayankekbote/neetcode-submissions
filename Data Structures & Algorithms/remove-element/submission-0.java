class Solution {
    public int removeElement(int[] nums, int val) {
       int [] removed = new int [nums.length];
       int i = 0;
       int j = 0;

       while(i<nums.length){
        if(nums[i]!=val){
            removed[j] = nums[i];
            
            j++;
        }
        i++;
       }

       Arrays.fill(nums,0);

       for(int k = 0; k < removed.length; k++){
        nums[k] = removed[k];
       }

       return j;
    }
}