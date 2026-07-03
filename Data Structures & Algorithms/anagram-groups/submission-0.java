class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        LinkedHashMap<String,List<String>> map = new LinkedHashMap<>();
        for(String s : strs){
            
            char [] str = s.toCharArray();
            Arrays.sort(str);
            String key = new String(str);

            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
