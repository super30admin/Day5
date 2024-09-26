
// Time Complexity : O(n)  where n is number of characters in pattern
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Create hashmap to link each character of pattern to every word in the string
//if key doesn't exist ideally the corresponding word should also be not present
//Create a hashset for the word, to check whether we are assingning same word to different character by mistake
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        String[] splitted = s.split("\\s+");
        if(pattern.length() != splitted.length)
            return false;
        for(int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String word = splitted[i];
            if(!hm.containsKey(c)){
                if(hs.contains(word))
                    return false;
                hm.put(c,word);
                hs.add(word);
            }
            else{
                String val = hm.get(c);
                if(!word.equals(val))
                    return false;
            }
        }
        return true;
    }
}