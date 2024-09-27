import java.util.HashMap;

public class Isomorphic_Strings {
	public boolean isIsomorphic(String s, String t) {
		//Approach: 1. Here am consdiering a hashmap and creating entries such that character from s and t have one-one correspondence
		//2. I have 2 conditions to check this, a). if the key is already there in the map, I will return false if the value is not same as t.charAt(loop)
		//3. Above condition checks for S -> T, but to check for T->S, everytime while making an entry in map, am checking whether the value is already present if so return false. 
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Character> map= new HashMap<Character, Character>(26);
        for(int loop=0;loop<s.length();loop++)
        {
            if(map.containsKey(s.charAt(loop)))
            {
                if(map.get(s.charAt(loop)) != t.charAt(loop))
                    return false;
            }else
            {
                if(map.containsValue(t.charAt(loop)))
                    return false;
                map.put(s.charAt(loop),t.charAt(loop));
            }
        }
        return true;
    }
}
//Time Complexity : O(n), for sorting it takes nlogk and for iterating through list, its O(n). 
//Space Complexity : O(1), since we are using a hashmap of size 26 entries, this will not grow with the input. So O(1).
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
