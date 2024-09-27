// Time Complexity : All the operations are done in O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH:
1. if character is present in hashmap, check for corresponding value;
2. if character is not present in hashmap, check for corresponding value in hashset before creating a new entry in hashmap;
*/

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");

        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> hashSet = new HashSet<>();

        if(sArray.length != pattern.length()) return false;
        if(null == sArray || null == pattern || sArray.length == 0 || pattern.length() == 0) return false;

        for(int i=0; i<pattern.length(); i++){
            if(!patternMap.containsKey(pattern.charAt(i))){
                if(hashSet.contains(sArray[i])) return false;
                patternMap.put(pattern.charAt(i), sArray[i]);
                hashSet.add(sArray[i]);
            } else {
                if(!patternMap.get(pattern.charAt(i)).equals(sArray[i])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String pattern = "abba", s = "dog cat cat dog"; //true
        System.out.println(wordPattern(pattern, s));

        String pattern2 = "abba", s2 = "dog cat cat fish"; //false
        System.out.println(wordPattern(pattern2, s2));

        String pattern3 = "aaaa", s3 = "dog cat cat dog"; //false
        System.out.println(wordPattern(pattern3, s3));
    }
}
