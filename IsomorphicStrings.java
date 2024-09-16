// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        Map<String, String> hashMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++) {
            
            String c = new StringBuilder().append(s.charAt(i)).append("1").toString();
            String d = new StringBuilder().append(t.charAt(i)).append("2").toString();

            if(hashMap.containsKey(c) && !hashMap.get(String.valueOf(c)).equals(d)) {
                    return false;
            }
            if(hashMap.containsKey(d) && !hashMap.get(d).equals(c)) {
                    return false;
            } else {
                hashMap.put(c, String.valueOf(d));
                hashMap.put(d, String.valueOf(c));
            }
        }
        return true;
    }
}