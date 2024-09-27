package s30Coding;

import java.util.*;

//Time Complexity :- O(n) - Traverse through the length of the pattern once.

// Space Complexity :- O(n) - HashMap

// LeetCode SuccessFull :- Yes

// Logic :- Traverse through the pattern string and check if character is present in the hashmap as key,
//			If yes, add the string to the map as value.

public class WordPattern {
	public boolean wordPattern(String pattern, String st) {
        String[] str = st.split("\\s+");
        if(pattern.length() != str.length || pattern.length() == 0 || str.length == 0){
            return false;
        }
        
        HashMap<Character,String> map = new HashMap<>();
        for(int i = 0; i < pattern.length();i++)
        {
            if(map.containsKey(pattern.charAt(i))){
                if(map.get(pattern.charAt(i)).equals(str[i])){
                    continue;
                }
                else{
                    return false;
                }
            }
            else if(map.containsValue(str[i])){
                return false;
            }else{
                map.put(pattern.charAt(i),str[i]);
            }
        }
        return true;
    }
}
