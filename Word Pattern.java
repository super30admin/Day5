import java.util.*;

/**
Create a HashMap to store character->word mapping
Create a HashSet to store word presence
Check in hashmap if mapping is incorrect 
or check if the word is already seen and mapped
if not add mapping and word to map and se respecively


Time Complexiy: O(n), Space- O(n)  */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(s==null || s.length()==0) return false;
        String[] words = s.split(" ");

        if(words.length!=pattern.length() || pattern.length()==0) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i =0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String word = words[i];
        
            // Check c already present check mapping, if incorrect return false;
            if(map.containsKey(c)){
                if(map.get(c).equals(word)==false) return false;
            } 
            else {
            // check if word is already seen previously return false.
            if(set.contains(word)) return false;
            // else add mapping
            map.put(c,word);
            set.add(word);
            }
            
        }
        return true;
    }
}