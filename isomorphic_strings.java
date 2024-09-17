//TC: O(n)   n - as string length and atmost n can be 26 letters so can be considered as constant  [in the for loop each search opeartion in HashMap takes only O(1)]
// SC: O(n)  can be considered constatnt again as only 26 alphabets are present and stored in the map

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s_str = new HashMap<>();
        HashMap<Character, Character> t_str = new HashMap<>();
        
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0; i< s.length();i++){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            if(s_str.containsKey(s.charAt(i)))
            {if(s_str.get(s_char)!=t_char)
                    return false;
            }
            else s_str.put(s.charAt(i), t.charAt(i));
            
            if(t_str.containsKey(t.charAt(i)))
            {if(t_str.get(t_char)!=s_char)
                    return false;
            }
            else t_str.put(t.charAt(i),s.charAt(i));
        }
        
        return true;
    }
}