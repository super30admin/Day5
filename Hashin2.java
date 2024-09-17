class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
         HashMap<Character,Character> map2 = new HashMap<>();
        for(int i =0; i<s.length();i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            if(!map.containsKey(sc))
            {
                map.put(sc,tc);
            }
            else{
                if(!(tc==map.get(sc)))
                    return false;
            }
            
        if(!map2.containsKey(tc))
            {
                map2.put(tc,sc);
            }
            else{
                if(!(sc==map2.get(tc)))
                    return false;
            }
        }
        return true;
    }
}