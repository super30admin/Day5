/**
* Time complxity : O(N)
* Space :O(N)
*/

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Character> s_t = new HashMap<>();
        HashMap<Character, Character> t_s = new HashMap<>();
        boolean result=true;
        for(int i= 0; i< s.length();i++) {
            if(s_t.containsKey(s.charAt(i))){
                result = (s_t.get(s.charAt(i)) == t.charAt(i));
                if (result == false)
                    return false;
            }
            
            else if (t_s.containsKey(t.charAt(i))){
                return false;
            }
            
            else{
                s_t.put(s.charAt(i),t.charAt(i));
                t_s.put(t.charAt(i),s.charAt(i));

            }
            
        }
        return result;
        
    }
}


