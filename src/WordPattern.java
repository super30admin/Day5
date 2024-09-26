// Time Complexity : O(N)
// Space Complexity :  O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Problem 13
Leetcode #290 https://leetcode.com/problems/word-pattern/
Given a pattern and a string , find if the string follows the pattern or not.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 */
public class WordPattern {
        public boolean wordPattern(String pattern, String s) {
            Map<Character, String> m = new HashMap<>();
            String ar[] = s.split(" ");
            if(ar.length != pattern.length()){
                return false;
            }
            List<String> arr = new ArrayList<>();
            for(int i=0; i<pattern.length();i++)
            {
                if(m.get(pattern.charAt(i)) != null)
                {
                    continue;
                }
                if(arr.contains(ar[i]))
                {
                    return false;
                }
                m.put(pattern.charAt(i), ar[i]);
                arr.add(ar[i]);

            }
            for(int i=0; i<pattern.length();i++)
            {
                if(!m.get(pattern.charAt(i)).equals(ar[i]))
                {
                    return false;
                }
            }
            return true;
        }
}
