//WORD PATTERN 
//Time complexity: O(N), number of words in string s or number of characters in pattern
//Space complexity: O(1) 
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];
            //if the map contains does not contain the key, but the set contains the value
            //means the value has already been mapped to another key so return false
            if(!map.containsKey(c) && set.contains(w)) {
                return false;
            }
            //if the map contains key but the value of that key is not equal to the word, return false.
            if(map.containsKey(c) && !map.get(c).equals(w)) {
                return false;
            }
            //store into the array and store value in the set.
            map.put(c, w);
            set.add(w);
        }
        return true;
    }
}