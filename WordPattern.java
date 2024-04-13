// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Like Isomorphoic strings, this problem can also be solved using all 3 approaches mentioned for IsomorphicString
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map_patt= new HashMap<Character,String>();
        HashMap<String,Character> map_str = new HashMap<String, Character>();

        if(pattern == null && s == null) {
            return true;
        }

        if(pattern == null || s == null) {
            return false;
        }
        String[] words = s.split(" ");
        if(pattern.length() != words.length) {
            return false;
        }

        for(int i=0;i< pattern.length();i++) {
            char c = pattern.charAt(i);
            String sword = words[i];

            if(map_patt.containsKey(c)) {
                if(!map_patt.get(c).equals(sword)) {
                    return false;
                }
            }else{
                map_patt.put(c, sword);
            }

            if(map_str.containsKey(sword)) {
                if(!map_str.get(sword).equals(c))
                    return false;

            }else{
                map_str.put(sword, c);
            }
        }
        return true;
    }
}