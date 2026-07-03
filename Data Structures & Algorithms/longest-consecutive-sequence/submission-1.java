class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
        HashSet <Integer> set = new HashSet<>();
        
        for(int num: nums){
            set.add(num);
        }
        int maxCount =1;
        for(int num:set){
            int count = 1;
        
            if(!set.contains(num-1)){
                int number = num;
                while(set.contains(number+1)){
                    count++;
                    number++;
                } 
            }
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
}
