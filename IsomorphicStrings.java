//Time Complexity : O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

class IsomorphicStrings {
    // Using hashmap and hashSet
    public boolean isIsomorphic(String s, String t) {

        int sLength = s.length();
        int tLength = t.length();

        if(sLength != tLength)
            return false;

        // creating map for String s
        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        for(int i=0; i < sLength; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(smap.containsKey(sChar)) {
                if(smap.get(sChar) != tChar)
                    return false;
            }
            else {
                if(tSet.contains(tChar))
                    return false;
                smap.put(sChar, tChar);
                tSet.add(tChar);
            }
        }

        return true;

    }
}