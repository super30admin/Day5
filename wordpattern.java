// Time Complexity : O(n) 
// Space Complexity : O(n)


class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern.length() == 0 || s.length() == 0)
            return false;
        Map<Character, String> pmap = new HashMap();
        Map<String, Character> smap = new HashMap();
        String[] w = s.split(" ");
        if (w.length != pattern.length())
            return false;
        for (int i = 0; i < w.length; i++) {
            String word = w[i];
            char a = pattern.charAt(i);
            if (!pmap.containsKey(a))
                pmap.put(a, word);
            else {
                if (!pmap.get(a).equals(word))
                    return false;
            }
            if (!smap.containsKey(word))
                smap.put(word, a);
            else {
                if (smap.get(word) != a)
                    return false;
            }
        }
        return true;
    }
}
