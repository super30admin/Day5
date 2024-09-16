//Time Complexity:O(n)
//Space Complexity: O(n)
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == t.length()){
            HashMap<Character, Character> sMap = new HashMap<>();
            HashMap<Character, Character> tMap = new HashMap<>();
            for(int i=0; i<=s.length()-1;i++){
                char charS = s.charAt(i);
                char charT = t.charAt(i);
                if(!sMap.containsKey(charS)){
                    sMap.put(charS, charT);
                }else{
                    if(sMap.get(charS) != charT){
                        return false;
                    }
                }  
                if(!tMap.containsKey(charT)){
                    tMap.put(charT, charS);
                }else{
                    if(tMap.get(charT) != charS){
                        return false;
                    }
                }  
            }
        }
        return true;
    }
}