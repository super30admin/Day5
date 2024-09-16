class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        List<List<String>> result = new ArrayList<>();
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String str1 = new String(chars);
            if(!map.containsKey(str1)){
                map.put(str1,new ArrayList<>());
            }
            map.get(str1).add(str);
        }
        result.addAll(map.values());
        return result;
    }
}

//Time Complexity: O(nmlogm) where n is the length of the string array and m is the max length of string in strs.
//the for loop has complexity O(N) as we iterate through the strings.
//the sorting of strings happen in O(klogk) time.
