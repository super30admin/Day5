//The appraoch here is to use a hashmap to map the characters from the pattern to the words in the string.
//We also use a hashset to keep track of the words that have already been mapped to a character.
//Time Complexity: O(n)
//Space Complexity: O(1)
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> charMap = new HashMap<Character,String>();
        HashSet<String> wordSet = new HashSet<String>();

        String[] wordArray = s.split(" ");
        if(pattern.length()!=wordArray.length) return false;
        for(int i = 0; i<pattern.length(); i++){
            char ch = pattern.charAt(i);
            String word = wordArray[i];
            if(charMap.containsKey(ch)){
                if(!charMap.get(ch).equals(word)) return false;
            } else{
                if(wordSet.contains(word)) return false;
                else{
                    charMap.put(ch, word);
                    wordSet.add(word);
                }
            }
        }
        return true;
    }
}
