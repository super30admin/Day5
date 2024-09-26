//Time Complexity: O(N), where N is length of each string. We process each character in both the strings exactly once to determine if the strings are isomorphic.
// Space Complexity: O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


class IsomorphicStrings {
    HashMap<Character, Character> st = new HashMap<>();
    HashSet<Character> mapped = new HashSet<>();
    public boolean isIsomorphic(String s, String t) {
        for(int i=0; i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(st.containsKey(sChar)){
                if(st.get(sChar) != tChar)
                    return false;
            }else{
                if(mapped.contains(tChar)){
                    return false;
                }
                mapped.add(tChar);
                st.put(sChar, tChar);
            }
        }
        return true;
    }
}