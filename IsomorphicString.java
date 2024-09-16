// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public boolean isIsomorphic(String s, String t) {
        //Aproach 1: using two hashmaps

        //data validation
        if(s.length() != t.length())
            return false;

        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();

        //checking for smap
        for(int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            //check if smap contains the char at i
            if(smap.containsKey(schar)){
                //check if 1st char in smap is mapped to 1st char in tmap
                if(smap.get(schar) != tchar){
                    return false;
                }
            }
            else{
                smap.put(schar, tchar);
            }
            //check if tmap contains the char at i
            if(tmap.containsKey(tchar)){
                //check if 1st char in tmap is mapped to 1st char in smap
                if(tmap.get(tchar) != schar){
                    return false;
                }
            }
            else{
                tmap.put(tchar, schar);
            }
        }
        return true;
    }
}