// Leetcode 290 - Word Pattern

// Time complexity = O(n)
// Space compexity = O(n)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] word_array = s.split(" ");
        
        HashMap<Character, String> ptoS = new HashMap();
        HashMap<String, Character> Stop = new HashMap();
        
        if (pattern.length() != word_array.length){
            return false;
        }
        for(int i=0; i<pattern.length();i++){
            
            if(!ptoS.containsKey(pattern.charAt(i))){
                if(Stop.containsKey(word_array[i])){
                    return false;
                }
                ptoS.put(pattern.charAt(i), word_array[i]);
                Stop.put( word_array[i], pattern.charAt(i));
            }else{
                if(! ptoS.get(pattern.charAt(i)).equals(word_array[i])){
                    return false;
                }
            }
        }
        
        return true;
    }
}