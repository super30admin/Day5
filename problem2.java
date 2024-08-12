// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//Explaination: I have used 2 hashMap for making the search easy for
//corresponding characters of both sting s and t

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> r = new HashMap<>(26);
        HashMap<Character,Character> h = new HashMap<>(26);
        for(int i = 0; i< s.length(); i++){
            if(h.get(s.charAt(i))!= null){
                if(h.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else{
                h.put(s.charAt(i), t.charAt(i));
            }
            if(r.get(t.charAt(i))!= null){
                if(r.get(t.charAt(i)) != s.charAt(i)) return false;
            }
            else{
                r.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
