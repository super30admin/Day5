
//time: O(n)
//space: O(n)
//Appraoch:
//1. store the char in s and t in a hashmap
// check if the mapped char in t is already present in the set or not(this tells us that the char inn t is already mapped to a char in s)
//if the chars mapped in s and t are not same return false, else return true;
class Isomorphic_string {
    public boolean isIsomorphic(String s, String t) {
        // hashmap stores the mapping of chars in s to t
        HashMap<Character, Character> hm = new HashMap<>();
          //keep a track of already mapped char
        HashSet<Character> hs = new HashSet<>();
        if(s.length() != t.length()){
            return false;
        }
        
        
        for(int i = 0; i<s.length(); i++){
            char c1= s.charAt(i);
            char c2 = t.charAt(i);
            
            if(hm.containsKey(c1)){
                if(hm.get(c1) != c2){
                    return false;
                }
            } else {
                if(hs.contains(c2)){
                    return false;
                }
                hm.put(c1,c2);
                hs.add(c2);
            }
        }
        
      
        
        return true;
        
    }
}