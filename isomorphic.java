//Time Complexity : O(n) as we performed binary search on small part of an array expected to have a target
//Space Complexity : O(1) as it's taking constant space
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach

import java.util.*;

public class isomorphic {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashSet<Character> set1 = new HashSet<>();
          for (int i = 0; i < s.length(); i++) {
              char sChar = s.charAt(i);
              char tChar = t.charAt(i);
            if (map1.containsKey(sChar)) {
                if (map1.get(sChar) != tChar) {
                    return false;
                }
            } else {
                map1.put (sChar, tChar);
                if (set1.contains(tChar)) {
                    return false;
                }
                set1.add(tChar);
            }
    }
        return true;
}
    
	public static void main(String[] args) {
		String s="egg";
		String t = "add";
		
		boolean bool= isIsomorphic(s,t);
		if(bool == true)
		{
			System.out.println("The strings are isomorphic");
		}
		else
		{
			System.out.println("The strings are not isomorphic");
		}

	}

}
