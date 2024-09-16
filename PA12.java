class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm = new HashMap<>();
        HashSet<Character> hset = new HashSet<>();
        
        for (int i=0; i<s.length() ; i++){
            if(!hm.containsKey(s.charAt(i))){
                if(!hset.contains(t.charAt(i))){
                    hm.put(s.charAt(i),t.charAt(i));
                    hset.add(t.charAt(i));
                }
                else{
                    return false;
                }
                    
            }
            else{
               
                if(hm.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
                
            }
          
        }
        
        return true;
    }
}