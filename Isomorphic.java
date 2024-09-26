
//Space Complexity: O(1);
//Time Complexity: O(N)

public class Isomorphic {
	public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i =0; i<s.length();i++){
        char schar = s.charAt(i);
        char tchar = t.charAt(i);
            if(sMap.containsKey(schar)){
               if (sMap.get(schar) != tchar)
                   return false;
            }
            else{
                sMap.put(schar,tchar);
            }
          if(tMap.containsKey(tchar)){
               if (tMap.get(tchar) != schar)
                   return false;
            }
            else{
                tMap.put(tchar,schar);
            }
    } return true;
    }
}

