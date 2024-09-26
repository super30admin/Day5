// Time Complexity : O(N) where N - length of strings
// Space Complexity : O(Constant).
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Nope.


// Your code here along with comments explaining your approach
class IsIsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){return false;}
        Map<Character,Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char key = s.charAt(i);
            char value = t.charAt(i);
            if(!map.containsKey(key)){
                if(set.contains(value)){return false;}
                map.put(key,value);
                set.add(value);
            }else{
                if(map.get(key) != value){return false;}
            }
        }
    return true;
    }
}