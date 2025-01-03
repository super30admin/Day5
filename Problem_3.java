// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach : Used a HashMap for character-to-word mapping and a HashSet to ensure unique word mappings,
// verifying consistent one-to-one correspondence between the pattern and s. Any mismatch or duplication returns false.

import java.util.HashMap;
import java.util.HashSet;

class SolutionWordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            String str = arr[i];
            if(map.containsKey(c)) {
                if(!str.equals(map.get(c))) {
                    return false;
                }
            } else {
                map.put(c, str);
                if(set.contains(str)) {
                    return false;
                }
                set.add(str);
            }
        }
        return true;
    }
}
