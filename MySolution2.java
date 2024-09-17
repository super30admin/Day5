class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> s2t = new HashMap<Character,Character>();
        HashMap<Character, Character> t2s = new HashMap<Character,Character>();

        for(int i = 0; i<=s.length()-1;i++){
            char c = s.charAt(i);
            char c2 = t.charAt(i);
            if(s2t.containsKey(c)){
                if(s2t.get(c) != c2) {
                    return false;
                }
            }
            else{
                s2t.put(c,c2);
            }
        }

        for(int i = 0; i<=s.length()-1;i++){
            char c = t.charAt(i);
            char c2 = s.charAt(i);
            if(t2s.containsKey(c)){
                if(t2s.get(c) != c2) {
                    return false;
                }
            }
            else{
                t2s.put(c,c2);
            }
        }
        return true;

    }
}1