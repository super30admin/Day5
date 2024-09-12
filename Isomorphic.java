//Time Complexity:O(n)
//Space Complexity: O(n)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Character> smap=new HashMap<>();
        HashMap<Character,Character> tmap=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (smap.get(s.charAt(i)) == null) {
                smap.put(s.charAt(i), t.charAt(i));
            } else {
                if (smap.get(s.charAt(i)) != t.charAt(i))
                    return false;
            }
            if (tmap.get(t.charAt(i)) == null) {
                tmap.put(t.charAt(i), s.charAt(i));
            } else {
                if (tmap.get(t.charAt(i)) != s.charAt(i))
                    return false;
            }
        }
        return true;
    }
}
