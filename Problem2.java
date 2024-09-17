Time Complexity : O(n)
Space Complexity : O(n)
Runs on LeetCode : Yes.

public class Solution {
public boolean isIsomorphic(String s, String t) {
   
     if(s.length() != t.length()) {			// Check if the length of 2 strings are equal or not. If not then it cannot be isomorphic.
        return false;
    }

    HashMap<Character, Character> h1 = new HashMap<Character, Character>();		// Create 2 new hashmaps.
    HashMap<Character, Character> h2 = new HashMap<Character, Character>();

    for(int i = 0; i < s.length(); i++) {			
        if(h1.get(s.charAt(i))!=null) {			// If nothing in hashmap. Put it in hashmap.
        if(h1.get(s.charAt(i))!=(t.charAt(i))) return false;	// Check if the value in hashmap compares with value in the string.
        }
        else
            h1.put(s.charAt(i),t.charAt(i));		// put key,value in hashmap.
    }
        for(int i = 0; i < t.length(); i++) {		// Used to create a reverse hashmap to avoid wrong result.
        if(h2.get(t.charAt(i))!=null)
        {
        if(h2.get(t.charAt(i))!=(s.charAt(i))) return false;
        }
        else
            h2.put((t.charAt(i)),(s.charAt(i)));
        }
    return true;
    }
}
    s