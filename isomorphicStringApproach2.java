// Time complexity - O(n) - looping through n elements
// Space complexity - O(1) - constant in general
// Solution using two hashMap and a hashSet

class Solution {
    public boolean isIsomorphic(String s, String t) {
                if ((s.length() != t.length()) || (s.length() == 0 || s == null) || (t.length() == 0 || t == null))
 return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i); //assigned charaters in the string
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) != tChar) return false;
            } else {
                sMap.put(sChar, tChar);
                if(tSet.contains(tChar)) return false;
                else tSet.add(tChar);
            }
        }
        return true;
    }
}