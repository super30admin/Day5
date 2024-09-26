//Approach 1: Key as a sorted string
//Approach 2: Key as a character count
//Overall Time Complexity: O(NK) where N-># of elements in list, K-> lenght of selected string
//Space Complexity: O(NK)
//Given only lower case English Letters
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();
        
        HashMap<String, List> group = new HashMap<>();
        
        for(String s: strs){
            int[] ch = new int[26];
            for(int i = 0; i < s.length(); i++){
                ch[s.charAt(i) - 'a'] += 1;
            }
            
            //Arrays.toString(arrayName) is used to convert int[] directly to string
            //Alternatively we can also use a char[] but there we will have to use String.valueOf()
            String key = Arrays.toString(ch);
            if(!group.containsKey(key)){
                group.put(key, new ArrayList<>());
            }
            group.get(key).add(s);
        }
        
        return new ArrayList(group.values());
    }
}