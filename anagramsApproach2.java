class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);
            if(!map.containsKey(sortedString)){
                map.put(sortedString,new ArrayList<>());
            }
            map.get(sortedString).add(str);
        }
        return new ArrayList(map.values());
    }
}