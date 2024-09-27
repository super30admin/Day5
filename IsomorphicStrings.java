// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach
public class IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t){
        if(s.length() != t.length()) return false;
        // Maps to store mapping between chars at s and t.
        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            // Iterating through each char at s and t.
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            // if the s map alrady contains the s char
            if (sMap.containsKey(sChar)){
                // check if the mapping of s is same as current char at t
                if (sMap.get(sChar) != tChar) return false;
            }
            // otherwise perform put for s map.
            else{
                sMap.put(sChar, tChar);
            }
            // if the t map alrady contains the t char
            if (tMap.containsKey(tChar)){
                // check if the mapping of t is same as current char at s
                if (tMap.get(tChar) != sChar) return false;
            }
            // otherwise perform put for s map.
            else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String s = "foo";
        String t = "bar";
        System.out.println(isIsomorphic(s,t));
    }
}