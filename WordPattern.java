// Time Complexity : O(N) where N - length of strings
// Space Complexity : O(Constant).
// Did this code successfully run on Leetcode : Yes.
// Any problem you faced while coding this : Nope.


// Your code here along with comments explaining your approach
class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] s = str.split("\\s+");
        if(pattern.length() != s.length){return false;}
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        int n = pattern.length();
        for(int i = 0; i < n; i++){
            char key = pattern.charAt(i);
            String value = s[i];
            if(!map.containsKey(key)){
                if(set.contains(value)){return false;}
                map.put(key,value);
                set.add(value);
            }else{
                if(!map.get(key).equals(value)){return false;}
            }
        }
    return true;
    }
}