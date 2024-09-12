//1 Map && 1set
//same as Isomorphic string. 
//take one map and One set, set will only has values 
// before adding any key-val to map, check if set has that val, if so return false, 
//if map has key, check if val is the same ? not? return false, else add the key-val to ap and val to set. 
//time complexity- pattern length - n , str array length - m, so O(m+n)
//Space - O(1) -- at max Hashmap will have 26 characters only, and so, set will only contain 26 individual values at max!

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] strs = s.split(" ");
        if (pattern.length() != strs.length)
            return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            String str = strs[i];
            char c = pattern.charAt(i);

            if (map.containsKey(c)) {
                if (!str.equals(map.get(c)))
                    return false;
            } else {
                if (set.contains(str))
                    return false;
                map.put(c, str);
                set.add(str);
            }
        }
        return true;
    }
}

// same as Isomorphic string.
// take Two Map, set will only has values
// check if charmap has the key-- then check if the values are same, if not
// return false, else continue;
// check if charmap doesnt have key, add key-val --> c, str
// check if str_map has the key(str)-- if no add the key-val -> str,c pair.
// if str_map has the key, check if values are same, if same continue else
// return

// time complexity- pattern length - n , str array length - m, so O(m+n)
// Space - O(1) -- at max Hashmap will have 26 characters only, and so, set will
// only contain 26 individual values at max!

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] strs = s.split(" ");
        if (pattern.length() != strs.length)
            return false;

        HashMap<Character, String> char_map = new HashMap<>();
        HashMap<String, Character> str_map = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String str = strs[i];
            char c = pattern.charAt(i);

            if (char_map.containsKey(c)) {
                if (!str.equals(char_map.get(c)))
                    return false;
                // always do the String comparison with 'equals' as Strings are object(&/ADT)
            } else {
                char_map.put(c, str);
            }

            if (str_map.containsKey(str)) {
                if (str_map.get(str) != c)
                    return false;
            } else {
                str_map.put(str, c);
            }
        }
        return true;
    }
}