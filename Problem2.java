// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;
class Problem2 {
    public static void main(String args[]) {
        System.out.println(isIsomorphic("badc","baba"));
        System.out.println(isIsomorphic("egg","add"));
    }
    public static boolean isIsomorphic(String s, String t) {
        // if only one character is present then this doesn't require hashmap or hashset    
        if (s.length() == 1 && t.length() == 1) return true; 
        // we create a hashmap to store if char already occurred in string 2
        HashSet<Character> map = new HashSet<Character>();
        // to store the occurrences of characters string 1 with respect to string 2
        HashMap<Character, Character> map2 = new HashMap<Character, Character>();
        
        for(int i =0; i < s.length(); i++) {
            Character st = s.charAt(i);
            Character ts = t.charAt(i);
            // if map contains key then try to check if value is same or not, if not then return false
            if(map2.containsKey(st)) {
                if(map2.get(st) != ts) return false; 
            }
            else {
                // if character present in hashset already then we cannot add new mapping in hashmap so false condition 
                if(map.contains(ts)) return false;
                // add the occurrence of character if not already encountered
                map2.put(st,ts);
                map.add(ts);
            }
        }
        // if the string 1 and string 2 occurrences matched accordingly without any prblem then it is passed
        return true;
        
    }
}