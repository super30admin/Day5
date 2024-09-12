//Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//
//        Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true
//
//        Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false
//
//        Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false
//
//        Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false

// Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

// Time Complexity : O(1)
// Space Complexity: O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] sArray = s.split(" ");
        HashMap<Character, String> map = new HashMap<>();

        if(sArray.length != pattern.length()) return false;

        for(int i=0;i<pattern.length();i++){
            char patternIndex = pattern.charAt(i);
            if(!map.containsKey(patternIndex)){
                if(map.containsValue(sArray[i])) return false;
                map.put(patternIndex,sArray[i]);
            }
            else{
                if(!map.get(patternIndex).equals(sArray[i])) return false;
            }
        }

        return true;
    }
}