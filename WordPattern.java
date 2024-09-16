/**
Problem: Word Pattern.

Time Complexity: O(n) or O(m), depending on whichever is large; where n is the length of the pattern and m is the length of the string str
//because initially we check if they're not isomorphic by checking the lengths of both string and pattern



Space Complexity: O(n), as we use a hashmap, 
where n is the number of words in the string, or number of chars in pattern, as only when both are equal do we create a hashmap
Did this code successfully run on Leetcode : Yes

Approach : Use 2 HashMaps(exactly similar to isomorphic string problem)
1. For the first hashmap, keys are the characters in Pattern. Values are the words in the string.
2. For the second hashmap, this time, the keys are the words in the string. Values are the characters in pattern.
3. Now, check if both hashmaps have unique and same, associated key-value pairs. If the key-value pairs are different, they're not following a pattern.

*/
class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> charHM = new HashMap<>(); 
        HashMap<String, Character> stringHM = new HashMap<>();
        String[] words = str.split(" ");
        
        if(words.length != pattern.length()) 
            return false;
    
        for(int i = 0; i < pattern.length(); i++) {
            if(charHM.get(pattern.charAt(i)) != null) {
              if(!charHM.get(pattern.charAt(i)).equals(words[i])) {
                return false;
            }  
            }
            
            else {
                charHM.put(pattern.charAt(i), words[i]);
            }
        }
        
        for(int i = 0; i < words.length; i++) {
            if(stringHM.get(words[i])!=null) {
                if(!stringHM.get(words[i]).equals(pattern.charAt(i))) {
                return false;
            }
            }
            
            else {
                stringHM.put(words[i], pattern.charAt(i));
            }
        }
        System.out.println(charHM);
        System.out.println(stringHM);
        return true;
    }
}