// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Character> hm1 = new HashMap<>();
        HashMap<Character,Character> hm2 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(hm1.containsKey(c1)){
                if(!hm1.get(c1).equals(c2))
                    return false;
            }
            else{
                hm1.put(c1,c2);
            }

            if(hm2.containsKey(c2)){
                if(!hm2.get(c2).equals(c1))
                    return false;
            }
            else
                hm2.put(c2,c1);

        }
        return true;
    }
}