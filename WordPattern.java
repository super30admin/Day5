class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length)
            return false;
        HashMap<Character, String> hm = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char curr = pattern.charAt(i);
            if (hm.containsKey(curr)) {
                if (!hm.get(curr).equals(str[i])) {
                    return false;
                }
            } else {
                if (hm.containsValue(str[i])) {
                    hm.put(curr, str[i]);
                }
            }
        }
        return true;
    }

}
