//Given a pattern and a string str, find if str follows the same pattern.
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

//Example 1:
//Input: pattern = "abba", str = "dog cat cat dog"
//Output: true

//Example 2:
//Input:pattern = "abba", str = "dog cat cat fish"
//Output: false

//Example 3:
//Input: pattern = "aaaa", str = "dog cat cat dog"
//Output: false

//Example 4:
//Input: pattern = "abba", str = "dog dog dog dog"
//Output: false
//Notes:
//You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
// Time Complexity: O(N)
// Space Complexity: O(N)

public class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> ptos = new HashMap<>();
        HashMap<String, Character> stop = new HashMap<>();
        
        String[] words = s.split(" ");
        
        if (pattern.length()!= words.length){
            return false;
        }
        
        for (int i=0; i<pattern.length(); i++){
            char p = pattern.charAt(i);
            String w = words[i];
            
            if (ptos.containsKey(p) && !ptos.get(p).equals(w)) {
                return false;
            }
            else{
                ptos.put(p, w);
            }
                
            
            if (stop.containsKey(w) && !stop.get(w).equals(p))
            {
                return false;
            }    
            else{
                stop.put(w, p);
            }
                
        }
        
        return true;
    }
}
