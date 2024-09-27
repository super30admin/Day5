// Time Complexity : O(n)
// Space Complexity :O(n)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || t==null) return false;
        if(s.length()!=t.length()) return false;
        HashMap<Character, Character> smap=new HashMap<>();
        HashMap<Character, Character> tmap=new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            //s to t checking
            if(!smap.containsKey(schar))
            {
                smap.put(schar,tchar);
            } else {
                if(smap.get(schar)!=tchar) return false;
            }
            
            //t to schecking
            if(!tmap.containsKey(tchar))
            {
                tmap.put(tchar,schar);
            } else {
                if(tmap.get(tchar)!=schar) return false;
            }
            
        }
        return true;
        
    }
}
