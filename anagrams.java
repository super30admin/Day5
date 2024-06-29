// In this program, first the length of the string is checked. If it is zero, then an empty list is returned. Else, a loop is run for the entire list of strings, where each list is converted into a character array and sorted. These sorted character arrays are then converted to strings and assigned as keys. If the output map does not contain the key, the key and its corresponding lists are inserted into it. If the key is already present, then the corresponding string is just added to it. Finally thegrouped list is returned. The Time complexity is: O(NKlog(K)) and space complexity is O(NK). This code was successfully compiled and accepted in leetcode.


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs.length==0) {
            return new ArrayList();
        }
            
        Map<String,ArrayList> op=new HashMap<String,ArrayList>();
        for(String s:strs){
            char[] chararr=s.toCharArray();
            Arrays.sort(chararr);
            String key=String.valueOf(chararr);
            if(!op.containsKey(key)){
                op.put(key,new ArrayList());
            }
                
            op.get(key).add(s);
        }
        return new ArrayList(op.values());
    }
}