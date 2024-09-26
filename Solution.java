// Time complexity: O(n*m) where n is the length of the string array and m is the length of the string which is the longest in the array
// Spcae complexity: O(n)
// Did it run in Leetcode: yes
// Did you face any problems: no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<Long, List<String>> map = new HashMap<>();
        long code = 0;
        for(String s: strs){
            code = evaluate(s);
            if(!map.containsKey(code)){
                map.put(code, new ArrayList<>());
            }
            map.get(code).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
    
    public long evaluate(String s){
        int[] arr = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        long val = 1;
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            val = val * arr[c - 'a'];
        }
        
        return val;
    }
}
