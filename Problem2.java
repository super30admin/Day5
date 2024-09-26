class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] s_t = new int[256];
        int[] t_s = new int[256];
        char a, b;

        for(int i=0; i<s.length(); i++) {
            a = s.charAt(i);
            b = t.charAt(i);
            
            if(s_t[a] != t_s[b]) {return false;}
            
            s_t[a] = i+1;
            t_s[b] = i+1;
        }

        return true;
    }

    /*
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character, Character> sMap = new HashMap<>();
        // HashMap<Character, Character> tMap = new HashMap<>();
        HashSet<Character> set = new HashSet<>(); 
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
                
            } else {
               if(set.contains(tChar)) return false;
                set.add(tChar);
                sMap.put(sChar, tChar);
                    
            }
        }
        return true;
    }
    */
}