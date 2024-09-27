// 205. Isomorphic Strings
// Time O(n)
// Space O(n)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> stoT = new HashMap();
        HashMap<Character, Character> Ttos = new HashMap();
        
        for(int i=0; i<s.length(); i++){
            
            if(stoT.containsKey(s.charAt(i))){
                
                if (stoT.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else{
                stoT.put(s.charAt(i), t.charAt(i));
                
            }
            if(Ttos.containsKey(t.charAt(i))){
                if(Ttos.get(t.charAt(i))!= s.charAt(i)){
                    return false;
                }
            }else{
                Ttos.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
        
    }
}