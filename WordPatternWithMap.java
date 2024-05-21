/**
 Approach 1: Using two hash map, 1 {key->char, value->string}, 2 {key->string, value->char}

 Working: we are checking if there is one to one mapping of the character and
          string within the 2 hash map for each iteration by add ing the value to both hash map if the key is not
          present and comparing the values if key is present

 Time Complexity: O(m) //length of String s is greater than the  pattern, and we are traversing through s while performing a split operation
 Space Complexity: O(1) //as the maximum range of a character can go upto 26 chars which is much less than the limit provided as the length of the string
 */

class WordPatternWithMap {
    public boolean wordPattern(String pattern, String s) {

        if(pattern == null || s == null || pattern.length() == 0 || s.length() == 0) {
            return false;
        }

        String[] strs = s.split(" "); //O(m)

        if(pattern.length() != strs.length) {
            return false;
        }

        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> stringMap = new HashMap<>();

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
            }

            if(stringMap.containsKey(sStr)) {
                //the character mapped with the string does not matches current character
                if(stringMap.get(sStr)!=pChar) {
                    return false;
                }
            }
            else{
                stringMap.put(sStr, pChar);
            }

        }

        return true;

    }
}