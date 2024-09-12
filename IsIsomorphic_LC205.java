/*
 * Time Complexity: O(n) where n is length of either of the strings
 * Space Complexity: O(n) + O (n) => 0(n) Hashmap for each string
 */

package Super30;

import java.util.HashMap;

public class IsIsomorphic {

	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "add")); //true
		System.out.println(isIsomorphic("egg", "bad")); //false
	}
	
	public static boolean isIsomorphic(String s, String t) {
		
		//maintaiin two hashmaps for each character mapping
        HashMap<Character, Character> sTotMap = new HashMap<>();
        HashMap<Character, Character> tTosMap = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            //check for sTotMap
            if(sTotMap.containsKey(charS) && sTotMap.get(charS) != charT)
                return false;
            else
                sTotMap.put(charS, charT);
            
            //check for tTosMap
            if(tTosMap.containsKey(charT) && tTosMap.get(charT) != charS)
                return false;
            else
                tTosMap.put(charT, charS);
        }
        return true;
    }

}
