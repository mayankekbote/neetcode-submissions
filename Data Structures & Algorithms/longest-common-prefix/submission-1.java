class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minCount = Integer.MAX_VALUE;
        if (strs.length == 1) return strs[0];
        for(int i = 0 ; i < strs.length-1; i++){
            String first = strs[i];
            String second = strs[i+1];
            int j = 0 ;
            int k = 0;
            
            int count = 0;
            while(j<first.length() && k < second.length()){
                if(first.charAt(j) == second.charAt(k)){
                    count++;
                    j++;
                    k++;
                }
                else{
                    break;
                }
            }

            minCount = Math.min(count,minCount);
        }

        if (minCount == Integer.MAX_VALUE) return "";
        
        return strs[0].substring(0,minCount);
    }
}