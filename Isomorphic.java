
/*
 * 
 * T(C) : O(1)
 * S(C) : O(1) space is O(1) coz of 26 char keys in hashmap
 * Did it run on Leet code: yes
 * 

 * Pseudocode 
 * 
 * 1.) check if length of s and t hash maps are same if not return false
 * 2.) We will make two hash maps list s and t
 * 3.) check isomorphability from s to t and t to s
 * 4.) map chars in s to t and vice versa nor chars not currently in maps
 * 5.) if  we get wrong chars mapped for chars in s and t that have already been mapped then return false
 * 6.)  else return true at end
 * 
 * */






class Isomorphic{
public boolean isIsomorphic(String s, String t) {

		if(s.length() !=t.length ()) return false;
		HashMap<Character,Character> sMap = new HashMap<>();
		HashMap<Character,Character> tMap = new HashMap<>();
		for (int i =0; i<s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			if(!sMap.containsKey(sChar)){
				sMap.put(sChar,tChar);
			}else{
				if(sMap.get(sChar)!= (tChar)) return false;
            }
            
			if(!tMap.containsKey(tChar)){
				tMap.put(tChar,sChar);
			}else{
				if(tMap.get(tChar)!= (sChar)) return false;             
            }
		}
    return true; 
		}

}