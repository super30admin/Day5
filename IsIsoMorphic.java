//Time Complexity: O(n) => o(n) for iterating all elements
// Space Complexity: O(n) => Creation of Map

import java.util.HashMap;
import java.util.Map;

//Check each character from both string adding then as key from str1 and corresponding value from str2 and checking wrt each character if the pattern is followed

public class IsIsoMorphic {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                if(map.containsValue(t.charAt(i)))
                    return false;
                map.put(s.charAt(i) , t.charAt(i));
            }
            else if(map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
        }   
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isIsomorphic("bb", "ba"));
    }
    
}