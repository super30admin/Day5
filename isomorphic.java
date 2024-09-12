//Time complexity O(n)
//Space Complexity (1) (At max We store 256 chars in the hashmap, its constant)
class Solution {
  public boolean isIsomorphic(String s, String t) {

    Map<Character, Character> map1 = new HashMap<>();
    Map<Character, Character> map2 = new HashMap<>();
        
//map1
    for (int i = 0; i < s.length(); i++) {
        if(!map1.containsKey(s.charAt(i))) {
          map1.put(s.charAt(i), t.charAt(i));
        }else{
            if(map1.get(s.charAt(i)) == t.charAt(i)){
                continue;
            }else{
                return false;
            }
        }
    } 
    
//map2       
    for (int i = 0; i < t.length(); i++) {
        if(!map2.containsKey(t.charAt(i))) {
          map2.put(t.charAt(i), s.charAt(i));
        }else{
            if(map2.get(t.charAt(i)) == s.charAt(i)){
                continue;
            }else{
                return false;
            }
        }
   }
     return true;  
    }
}
