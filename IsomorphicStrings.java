// Time Complexity : 0(n) where n is the length of strings
// Space Complexity : 0(1) because there is constant(26) space for map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null || s.length()!=t.length())
            return false;

        //map for character mapping
        HashMap<Character, Character> map = new HashMap<>();

        //iterate through strings
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            //if map contains character, check if value is not different
            if(map.containsKey(c1)){
                if(c2 != map.get(c1))
                    return false;
            }
            //if map doen't contain charac, see if that value exists for other key in map
            else{
                if(map.containsValue(c2))
                    return false;
                map.put(c1,c2);
            }
        }

        return true;
    }
}