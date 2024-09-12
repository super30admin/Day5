//Time Complexity = O(N)
//Space Complexity = O(1) because maximum we would have 26 and 26 extries in each hashMap

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] splitStrings = s.split(" ");
        if(pattern.length() != splitStrings.length) return false;
        // source to target mapping track
        HashMap<Character, String> sMap= new HashMap<>();
        // target to source mapping track
        HashMap<String, Character> tMap = new HashMap<>();
        for(int i=0;i<pattern.length();i++) {
            char sChar = pattern.charAt(i);
            String tChar = splitStrings[i];
            // if character key does not exist, insert one
            if(!sMap.containsKey(sChar)) {
                sMap.put(sChar, tChar);
            }
            // checking the current target against exisiting source key,value pair
            if(!sMap.get(sChar).equals(tChar)) {
                return false;
            }
            // if string key does not exist for the targetMap, insert one
            if(!tMap.containsKey(tChar))
                tMap.put(tChar, sChar);
            // checking the current source against existing target key,value pair
            if (tMap.get(tChar) != sChar) return false;
        }
        return true;
    }
}