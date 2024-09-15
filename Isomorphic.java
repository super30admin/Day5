class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap hs = new HashMap<Character, Character>();
        HashMap hs1 = new HashMap<Character, Character>();
        if(s.length()!=t.length()){
            return false;
        }
        
        for(int i=0;i< s.length();i++){
           hs.put(s.charAt(i),t.charAt(i));
           hs1.put(t.charAt(i),s.charAt(i));
        }
        
        for(int i=0;i< s.length();i++){
           if(s.charAt(i) != (char)hs1.get(t.charAt(i))){
               return false;
           }
           if(t.charAt(i) != (char)hs.get(s.charAt(i))){
               return false;
           }
        }
        return true;
        
    }
}
