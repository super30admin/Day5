// Time Complexity : O(N)
// Space Complexity :O(NlogN)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
 Using 2 Hashmaps to store the variables and checking at every element
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<Character, Character>();
        HashMap<Character, Character> tmap = new HashMap<Character, Character>();
        
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if(!smap.containsKey(a)){
                smap.put(a,b);
            }
            else{
                if(!smap.get(a).equals(b)) return false;
            }
            if(!tmap.containsKey(b)){
                tmap.put(b,a);
            }
            else{
                if(!tmap.get(b).equals(a)) return false;
            }
        }
        return true;
    }
}
