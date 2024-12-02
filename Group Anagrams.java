class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0) return null;
        HashMap<String, List<String>> map = new HashMap<>();

        for(String current: strs){//n
            char[] characters = current.toCharArray();
            Arrays.sort(characters);//klogk
            //String sorted = new String(characters);
            String sortedStr = String.valueOf(characters);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());//k
            }
            map.get(sortedStr).add(current);
        }
        
        return new ArrayList<>(map.values());
    }
}