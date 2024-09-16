import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Efficient way of mapping the character to the string for pattern checking.

class pattern {
    public boolean wordPattern(String pattern, String s) {
        int idx = 0;
        // Split the string into ind. elements
        String words[] = s.split(" ");    
        //null case 
        if(pattern.length() != words.length) return false;

        HashMap<String, Character> hashMap= new HashMap<>();

        for(String word : words) {
            if(hashMap.containsKey(word) && hashMap.get(word) != pattern.charAt(idx)) {
                return false;
            }

            if(!hashMap.containsKey(word)){
                if(hashMap.containsValue(pattern.charAt(idx))) return false;
                hashMap.put(word, pattern.charAt(idx));
            }
            idx++;
        }
        return true;
    }
}