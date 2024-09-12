class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(!map.containsKey(c) && !map.containsValue(str[i])) {
                map.put(c, str[i]);
            }
            else if(!str[i].equals(map.get(c))) {
                return false;
            }
        }
        return true;
    }
}
