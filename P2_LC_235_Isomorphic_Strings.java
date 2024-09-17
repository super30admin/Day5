import java.util.*;
import java.io.*;

public class P2_LC_235_Isomorphic_Strings {
	public static void main(String[] args) {
		String s= "egg";
		String t="add";
		
		System.out.println("Output: "+ isIsomorphic(s,t));	
	}
	public static boolean isIsomorphic(String s, String t) {
        //Check if length is same, if not return false
        if(s.length() != t.length()) return false;
        
        HashSet<Character> set = new HashSet<Character>();
        HashMap<Character, Character> map = new HashMap< Character,Character>();
        
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                if(!map.containsValue(t.charAt(i))) 
                    map.put(s.charAt(i), t.charAt(i));
                else{
                    if(t.charAt(i) != s.charAt(i))
                        return false;
                }
            }else{
                if (map.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
        }
        return true;   
	}
}
