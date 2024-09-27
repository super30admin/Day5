// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach
//I will take two hashmaps and check the key value pair of first hashmap with key value pairs of another hashmap, 
//if first hashmap is empty, I will add key and value to it and if the key and value pairs of hashmaps 
//are not equal then I wil retun false 

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> smap = new HashMap<Character,Character>();
        HashMap<Character,Character> tmap = new HashMap<Character,Character>();
        
        if(s.length() != t.length()) return false;
        
        for(int i=0; i<s.length(); i++){
            
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if(!smap.containsKey(a)){
                smap.put(a,b);
            }
            else {
                if(!smap.get(a).equals(b)) return false;
            }
                
            if(!tmap.containsKey(b)){
                tmap.put(b,a);
            }
            else{
                if(!tmap.get(b).equals(a)) return false;
            } 
        }
        return true;
    }
}