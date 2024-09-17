class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> p = new HashMap<>();
        HashMap<String, Character> st = new HashMap<>();

        // spliting the string into words using delimiter
        String[] strs = s.split(" ");

        // pattern length and words length dosenot match, return false
        if (pattern.length() != strs.length) {
            return false;
        }

        for (int x = 0; x < pattern.length(); x++) {
            char key = pattern.charAt(x);// storing charcter of pattern into key
            String value = strs[x];// storing word of s into value

            // if key is already present and the value obtained from key dosent match the
            // value(word) the return false
            if (p.containsKey(key) && !(p.get(key).equals(value))) {
                return false;
            } else {// if key is not present in map then add value to map
                p.put(key, value);
            }

            // if value is already present in map and the value obtained from the map dosenr
            // match key return false
            if (st.containsKey(value) && !(st.get(value).equals(key))) {
                return false;
            } else {// if value is not in map then add value to map
                st.put(value, key);
            }
        }

        return true;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)