// Time Complexity : o(n)
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> map = new HashMap<>();

        for(int i=0 ; i<s.length() ; i++){

            if(!map.containsKey(s.charAt(i))) {

                if(map.containsValue(t.charAt(i))) return false;

                map.put(s.charAt(i),t.charAt(i));
            }

            else
            {
                if(map.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }

        return true;
    }
}
