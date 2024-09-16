//Time Complexity  O(N)
// Space complexity O(1)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if (pattern.length() != str.length)
            return false;
        HashMap<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c)) {
                if (set.contains(str[i])) {
                    return false;
                }
                set.add(str[i]);
                map.put(c, str[i]);
            } else {
                String result = map.get(c);
                if (!result.equals(str[i]))
                    return false;
            }
        }

        return true;

    }
}