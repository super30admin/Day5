/** Given a pattern and a string s, find if s follows the same pattern.
* Time complexity and space complexity O(1)
* Use 2 hashmaps. One with pattern character as a key and one with words as a key and try to see in both directions if there is a 1:1 mapping 
*/
class Solution {
    public boolean wordPattern(String pattern, String s) {
    	char[] pArr = pattern.toCharArray();
    	String[] sArr = s.split(" ");
        if (pArr.length != sArr.length)
        {
            return false;
        }
        Map<String, Character> sMap = new HashMap<String, Character>();
        Map<Character, String> patternMap = new HashMap<Character, String>();
        for (int i = 0; i < sArr.length; i++)
        {
            if (sMap.containsKey(sArr[i]))
            {
                Character value = sMap.get(sArr[i]);
                if (value != pArr[i])
                {
                    return false;
                }
            }
            else
            {
                sMap.put(sArr[i], pArr[i]);
            }
            if (patternMap.containsKey(pArr[i]))
            {
                String value = patternMap.get(pArr[i]);
                if (!value.equals(sArr[i]))
                {
                    return false;
                }
            }
            else
            {
                patternMap.put(pArr[i], sArr[i]);
            }
        }
        return true;    
    }
}

