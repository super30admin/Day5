//time complexity: O(N)
//Space complexity: O(N)
class Solution {
    public boolean wordPattern(String pattern, String str) {
        class Solution {
            public boolean isIsomorphic(String s, String t) {

                int pSize = t.length();
                int sSize = s.length();

                if (pSize != sSize)
                    return false;

                HashMap<Character, Character> pMap = new HashMap<>();
                HashMap<Character, Character> sMap = new HashMap<>();

                for (int i = 0; i < sSize; i++) {

                    char pChar = t.charAt(i);
                    char sStr = s.charAt(i);
                    if (!pMap.containsKey(pChar)) {
                        pMap.put(pChar, sStr);
                    } else {

                        if (!pMap.get(pChar).equals(sStr))
                            return false;
                    }

                    if (!sMap.containsKey(sStr)) {
                        sMap.put(sStr, pChar);
                    } else {

                        if (!sMap.get(sStr).equals(pChar))
                            return false;
                    }
                }

                return true;
            }
        }
    }
}