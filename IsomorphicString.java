package s30Coding;
import java.util.*;

//Time Complexity :- O(n)

// Space Complexity :- O(n)

// Leet Code Sucessfully Executed :- Yes


//Logic :- Traverse through the pattern string and check if character is present in the hashmap as key,
//If yes, add the character in string t to the map as value.

public class IsomorphicString {
	public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0; i < s.length();i++)
        {
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) == t.charAt(i)){
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(map.containsValue(t.charAt(i))){
                return false;
            }else{
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}
