// Time Complexity : O(n) where n is length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach


public class IsomorphicStrings {
    // Method-1 using 2 HashMaps
        public boolean isIsomorphic(String s, String t) {

            //null check
            if(s.length() != t.length()){
                return false;
            }

            HashMap<Character, Character> smap = new HashMap<>();
            HashMap<Character, Character> tmap = new HashMap<>();

            for(int i=0 ; i < s.length() ; i++){
                char schar = s.charAt(i);
                char tchar = t.charAt(i);

                //check smap 
                if(smap.containsKey(schar)){
                    if(smap.get(schar) != tchar)
                        return false;
                }
                else{
                    smap.put(schar,tchar);
                }

                //check tmap
                if(tmap.containsKey(tchar)){
                    if(tmap.get(tchar) != schar)
                        return false;
                }
                else{
                    tmap.put(tchar,schar);
                }
            }
            return true;
        }
}
