class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            int[] charArray = new int[26];
            
            for(int i = 0;i<s.length();i++){
                charArray[s.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(charArray);
            System.out.println(s+": "+key);
            if(!map.containsKey(key)){
                ArrayList<String> newList = new ArrayList<>();
                newList.add(s);
                map.put(key, newList);
            } else {
                List<String> al = map.get(key);
                al.add(s);
                map.put(key, al);
            }
        }
        
        result = new ArrayList<>(map.values());
        return result;
    }
}