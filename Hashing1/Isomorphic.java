package Solution;
import java.util.*;

public class Isomorphic {
	
	public static boolean isIsomorphic(String s, String t) {
		
		if(s==null || s.length() == 0 )
			return false;
		
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){
                 if(map.get(a).equals(b))
                continue;
                else
                return false;
            }else{
                if(!map.containsValue(b))
                map.put(a,b);
                else return false;
                
            }
        }
        return true;
 
    }	
	
	public static void main(String args[]){
		String s1 = "papa";
		String s2 = "mama"; 
		System.out.println(isIsomorphic(s1,s2));
	}
}