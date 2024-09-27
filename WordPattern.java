// Time Complexity : O(n*c) n->Number of Words, c->Average Length of Words
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
    We define two maps. 
    The first map, maps each element from A->B (Char->String).
    The second map, maps each element from B->A (String->Char).
    For every charecter if that mapping is valid or not.
    Similarly, we check if every word is a valid mapping or not.
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> hashMap = new HashMap<>();
        Map<String, Character> reverseHashMap = new HashMap<>();
        String[] arrayOfStrings = s.split(" ");
        if (arrayOfStrings.length != pattern.length()) return false;
        
        for (int i=0; i<pattern.length(); i++){
            if (hashMap.containsKey(pattern.charAt(i))){
                if (!hashMap.get(pattern.charAt(i)).equals(arrayOfStrings[i])) return false;   
            }
            else
                hashMap.put(pattern.charAt(i),arrayOfStrings[i]);
            
            if (reverseHashMap.containsKey(arrayOfStrings[i])){
                if (!reverseHashMap.get(arrayOfStrings[i]).equals(pattern.charAt(i))) return false;   
            }
            else
                reverseHashMap.put(arrayOfStrings[i],pattern.charAt(i));
        }
        return true;
    }
}