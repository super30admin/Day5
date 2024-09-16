//time complexity O(n) where n is number of length of either string
//space complexity O(1) because max size of hashmap is 26.

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false;
        HashMap<Character, Character> sHash = new HashMap<>();
        HashMap<Character, Character> tHash = new HashMap<>();
        if(s.length() != t.length()) return false;
        if(s.length() == t.length()){
            for(int i = 0; i < s.length(); i++){
                char a = s.charAt(i);
                char b = t.charAt(i);
                if(!sHash.containsKey(a)){
                    sHash.put(a, b);
                } else{
                    if(sHash.get(a) != b) return false;
                }
                if(!tHash.containsKey(b)){
                    tHash.put(b, a);
                } else{
                    if(tHash.get(b) != a) return false;
                }
            }
        }
        return true;
    }
}
