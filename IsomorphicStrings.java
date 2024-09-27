//Time Complexity : O(n)
//Space Complexity : O(1)


import java.util.HashMap;
import java.util.HashSet;

class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
        return false;
        
        HashMap<Character,Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();
        
        for(int i =0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            
            
            if(smap.containsKey(schar)){
                if(smap.get(schar)!=tchar)   //check if there is a mapping already present
                return false;
            }
            else{
                smap.put(schar,tchar);   //add mapping
                if(tset.contains(tchar)){
                    return false;
                }
                tset.add(tchar); //update set
            }
        
        }
        return true;
    }
}