// Time Complexity : The time complexity is O(n) where n is the length of the pattern or number of number of words.
// Space Complexity : The space complexity is O(k) where k is the length of the longest string.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {

        int len = pattern.length();

        String[] words = s.split(" ");

        if(pattern.length() != words.length){
            return false;
        }

        // Maps character in pattern to string in s
        Map<Character,String> map1 = new HashMap<>();
        // Maps string in s to character in pattern
        Map<String,Character> map2 = new HashMap<>();

        for(int i=0;i<pattern.length();i++){

            char ch = pattern.charAt(i);

            // If map1 doesn't contain the character key whereas map2 contains the string key, return false
            if(!map1.containsKey(ch)){

                if(map2.containsKey(words[i])){
                    return false;
                }
                // If map1 doesn't contain the character key and map2 doesn't contain the string key, add both of them.
                map1.put(ch,words[i]);
                map2.put(words[i],ch);
            }
            // If map1 contains the character key, but its value is not equal to the currently mapped string return false
            else{
                if(!map1.get(ch).equals(words[i])){
                    return false;
                }
            }

        }

        return true;

    }
}