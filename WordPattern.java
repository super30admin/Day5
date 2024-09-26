// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Set<String> set = new HashSet();
        String[] words = s.split(" ");
        if(words.length != pattern.length())
            return false;
        for(int i = 0;i <pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];
            if(!map.containsKey(c)){
                if(set.contains(word))
                    return false;
                map.put(c,word);
                set.add(word);
            }
            else if(!map.get(c).equals(word))
                return false;
        }
        return true;
    }
}