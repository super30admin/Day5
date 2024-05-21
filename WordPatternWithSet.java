
/**
 Approach 2: Using hash map and set, 1 {key->char, value->string}

 Working:
     if the map contains the character
        check if the value in the map is equal to current value, if not ret false
     else adding the character and string value in hash map,
        while adding checking if the set contains the string value,
            if yes, then the string is already mapped to a character in the map

 Time Complexity: O(m) //length of String s is greater than the  pattern, and we are traversing through s while performing a split operation
 Space Complexity: O(1) //as the maximum range of a characters can go upto 26 chars which is much less than the limit provided as the length of the string
 */

class Solution {
    public boolean wordPattern(String pattern, String s) {

        if(pattern == null || s == null || pattern.length() == 0 || s.length() == 0) {
            return false;
        }

        String[] strs = s.split(" "); //O(m)

        if(pattern.length() != strs.length) {
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<strs.length; i++) {

            char pChar = pattern.charAt(i);
            String sStr = strs[i];


            if(patternMap.containsKey(pChar)) {
                //the string mapped with the character does not matches string
                if(!patternMap.get(pChar).equals(sStr)) {
                    return false;
                }
            }
            else {
                patternMap.put(pChar, sStr);
                //it the set already contains the value then i tmeans that the string is already, mapped to a character
                if(set.contains(sStr)) {
                    return false;
                }
                set.add(sStr);
            }
        }

        return true;

    }
}
