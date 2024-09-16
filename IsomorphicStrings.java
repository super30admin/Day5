//Time Complexity: O(N)
//Space Complexity: O(1)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s1 = new HashMap<>();
        HashMap<Character, Character> s2 = new HashMap<>();
        int count = 0;
        if(s.length() == t.length())
            for(int i = 0; i < s.length(); i++){
                char charS = s.charAt(i);
                char charT = t.charAt(i);

                if(s1.containsKey(charS) && s1.get(charS) != charT) return false;

                else s1.put(charS, charT);


                if(s2.containsKey(charT) && s2.get(charT) != charS) return false;

                else s2.put(charT, charS);


            }
        return true;
    }
}