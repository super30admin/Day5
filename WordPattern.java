// Time Complexity : O(n)
// Space Complexity : O(3n) -> O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split("\\s+");
        HashMap<Character,String> charMap = new HashMap<>();
        HashMap<String,Character> strMap = new HashMap<>();
        if(pattern.length() != str.length) return false;
        for(int i=0;i<str.length;i++){
            if(charMap.containsKey(pattern.charAt(i)) && !charMap.get(pattern.charAt(i)).equals(str[i]))
                    return false;
            if(strMap.containsKey(str[i]) && !strMap.get(str[i]).equals(pattern.charAt(i)))
                return false;
            else{
                strMap.put(str[i],pattern.charAt(i));
                charMap.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }
}

/* Approach 2: Using single HashMap
Time Complexity : O(n^2) since using map.containsValue increases the time complexity to O(n^2)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split("\\s+");
        HashMap<Character,String> smap = new HashMap<>();
        if(pattern.length() != str.length) return false;
        for(int i=0;i<str.length;i++){
            if(smap.containsKey(pattern.charAt(i))){
                if(!smap.get(pattern.charAt(i)).equals(str[i]))
                    return false;
            }
            else{
                if(smap.containsValue(str[i])) return false;
                smap.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }
}
*/
