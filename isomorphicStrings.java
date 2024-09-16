// tc O(n)
// sc O(n)



class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character, Character> s2T = new HashMap<>();
        
        // char[] sCharArray = s.toCharArray();
        
        for(int i=0; i<s.length();i++){
            if(s2T.containsKey(s.charAt(i))){
                if(s2T.get(s.charAt(i))!=t.charAt(i))
                    return false;                
            }
            else{
                if(s2T.containsValue(t.charAt(i)))
                    return false;
                else
                    s2T.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
        
    }
}