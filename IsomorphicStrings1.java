class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length()!=t.length())
           return false;
        HashMap<Character,Character> map = new HashMap<>();
        Set<Character> seen = new HashSet<>();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i), d = t.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c)!=d)
                    return false;
            }else{
                if(seen.contains(d)) return false;
            } 
            map.put(c,d);
            seen.add(d);
        }
        return true;
    }
}