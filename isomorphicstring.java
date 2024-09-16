// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> smap = new HashMap<>();
        HashMap<Character,Character> tmap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            
           char schar=s.charAt(i);
           char tchar=t.charAt(i);
            
            if(smap.containsKey(schar)){
                if(smap.get(schar)!=tchar){
                    return false;
                }
            }else{
                smap.put(schar,tchar);
            }
            
            if(tmap.containsKey(tchar)){
                if(tmap.get(tchar)!=schar){
                    return false;
                }
            }else{
                tmap.put(tchar,schar);
            }
            
            
        }
        
        return true;
        
    }
}

MY APPROACH:

Here we are using two hash map one for each string so we will map if a->e in s then e->c in s is also valid but now in t e->a is already mapped so again if e encounters in e->n is invalid so each should s and t both should uniquely map each other checking characters at s -> t and t -> s if same char occurs same value should be there otherwise returning false 

Space complexity will be O(1) as we are using at most 26 alphabets mapping whatever n is 
Time Complexity Will be O(n) as traversing the whole string n is string length s.length();
