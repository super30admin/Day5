Time Complexity: O(n)
Space Complexity: O(1)( because at a max we store 26 capital letters and 26 small letters)
Challenges faced: A string is not isomorphic when the value associated with the string s doesn't match with the string t. 

Approach: Use hashmap to maintain the mapping in String t. In stead of checking for t values in map values use a hashset.
Time complexity to get an element from hashset is O(1). If the value is not present in hashmap and it is already present in Hashset then return false 
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }

        HashSet<Character> set1=new HashSet<Character>();
        HashMap<Character, Character> hashmap= new HashMap<Character, Character>();
        for(int i=0;i<s.length();i++){
            if(hashmap.containsKey(s.charAt(i))){
                if(hashmap.get(s.charAt(i))!=t.charAt(i)) return false;
            }else{
                if(set1.contains(t.charAt(i))) return false;                
                set1.add(t.charAt(i));
                hashmap.put(s.charAt(i), t.charAt(i));
            }            
        }
        return true;
    }
}