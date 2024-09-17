//TC: O(N) where N represents the length of the string and O(n) since we need to traverse the each character of string
// SC: O(N) where N represents the length of the string and O(n) since we need to store each character of string in HashMap

// We take a HashMap and store each character of the 2 string as Key and value pairs. We check if the character of a string matches to other character
// of the string. If we have ab in String s and cd in String t, we will store in map values of String s to String t i.e., a mapped to c and b mapped to d
//  if we find some other value for already existing key value pair, we return false;
// One more condition we need consider is if we have a string s as "ab" and string t as "aa", we will check if the value is already in map and if it does not match 
// with our key, we return false
import java.util.HashMap;

public class isomorphic {
	
	public boolean isomorphic_string(String s, String t) {
		
		if(s.length()!=t.length())
			return false;
		HashMap<Character, Character> map = new HashMap();
		
		for(int i=0;i<s.length();i++) {
			
			if(map.containsKey(s.charAt(i))) {
				if(map.get(s.charAt(i))==t.charAt(i))
					continue;
				else 
					return false;
			}
			if(map.containsValue(t.charAt(i)))
				return false;
			map.put(s.charAt(i), t.charAt(i));
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		isomorphic is = new isomorphic();
		System.out.println(is.isomorphic_string("ab","aa"));
	}

}
