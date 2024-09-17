/** Given two strings s and t, determine if they are isomorphic.
* Time complexity O(n). Space complexity O(1) since hashmap can contain maximum 26 keys
* Use 2 hashmaps and add use characters from each string as keys in each of the strings and characters from other string as values in each of the hashmap and check
* in both direction if there is a 1:1 mapping
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
    	char[] sArr = s.toCharArray();
    	char[] tArr = t.toCharArray();
        Map<Character, Character> sMap = new HashMap<Character, Character>();
        Map<Character, Character> tMap = new HashMap<Character, Character>();
        for (int i = 0; i < s.length(); i++)
        {
            if (sMap.containsKey(sArr[i]))
            {
                Character value = sMap.get(sArr[i]);
                if (value != tArr[i])
                {
                    return false;
                }
            }
            else
            {
                sMap.put(sArr[i], tArr[i]);
            }
            if (tMap.containsKey(tArr[i]))
            {
                Character value = tMap.get(tArr[i]);
                if (value != sArr[i])
                {
                    return false;
                }
            }
            else
            {
                tMap.put(tArr[i], sArr[i]);
            }
        }
        return true;
    }
}
