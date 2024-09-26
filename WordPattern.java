//Time Complexity: O(N)
//Space Complexity: O(N)
//Runtime: 1 ms, faster than 79.75% of Java online submissions for Word Pattern.
//Memory Usage: 38.4 MB, less than 5.76% of Java online submissions for Word Pattern.

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length())
            return false;
        String[] patternToWord = new String[26];
       HashMap<String,Character> map = new  HashMap<String,Character>();
        
        for(int i = 0; i < words.length; i++){
            if(patternToWord[pattern.charAt(i) - 'a'] == null)
                patternToWord[pattern.charAt(i) - 'a'] = words[i];
            else{
                if(!patternToWord[pattern.charAt(i) - 'a'].equals(words[i])){
                    return false;
                }
            }
            if(map.get(words[i]) == null)
                map.put(words[i],pattern.charAt(i));
            else{
                if(map.get(words[i]) != pattern.charAt(i)){
                    return false;
                }
            }
            
        }
   
        return true;
    }
}
