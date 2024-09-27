/**Time Complexity: O(n)
 * Space Complexity: O(1) ; map will have max of 256 keys **/
public class StringIsomorphic {
	public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map= new HashMap<>();
        Set<Character> set= new HashSet<>();
        
        for(int i=0; i<s.length(); i++) {
        	char sChar= s.charAt(i);
        	char tChar= t.charAt(i);
        	
        	//If map does not have key, check if value already exists
        	if(!map.containsKey(sChar)) {
        		if(set.contains(tChar)) return false;
        		map.put(sChar, tChar);
        		set.add(tChar);        		  		
        	}else {
        		//Not Isomorphic if key is found and value differs.
        		if(map.get(sChar)!=tChar) return false;
        	}
        }
        return true;
    }
	
	//Main Method
	public static void main(String[] args) {
		StringIsomorphic obj= new StringIsomorphic();		
		obj.isIsomorphic("egg","add");
	}
}
