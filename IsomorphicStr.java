// Time Complexity : O(n) where n is length of the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class SolutionWith2Maps {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t ==null) return false;
        if(s.length() != t.length()) return false;

        //2 hashMap solution
        Map<Character, Character> sMap = new HashMap();
        Map<Character, Character> tMap = new HashMap();

        for (int i = 0; i< s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            //check if sMap contains sChar mapped to tChar
            if(sMap.containsKey(sChar)) {
                if(tChar != sMap.get(sChar)) {
                    return false;
                }
            }//map sChar to tChar in sMap
            else {
                sMap.put(sChar, tChar);
            }
            //check if tMap contains tChar mapped to sChar
            if(tMap.containsKey(tChar)) {
                if(sChar != tMap.get(tChar)) {
                    return false;
                }
            }//map tChar to sChar in tMap
            else{
                tMap.put(tChar, sChar);
            }
        }
        return true;
    }
}

// Time Complexity : O(n) where n is length of the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class SolutionWithMapAndSet {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t ==null) return false;
        if(s.length() != t.length()) return false;

        //2 hashMap solution
        Map<Character, Character> sMap = new HashMap();
        Set<Character> tSet = new HashSet<Character>();

        for (int i = 0; i< s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            //check if sChar is mapped to tChar in sMap
            if(sMap.containsKey(sChar)) {
                if(tChar != sMap.get(sChar)) {
                    return false;
                }
            }//check tChar is present in tSet, if contains that means already present.
            else{
                if(tSet.contains(tChar)) {
                    return false;
                }
                //if not present add
                sMap.put(sChar, tChar);
                tSet.add(tChar);
            }
        }
        return true;
    }
}

// Time Complexity : O(n) where n is length of the string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class SolutionWithTwoCharArray {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t ==null) return false;
        if(s.length() != t.length()) return false;

        //2 charArraySol
        char[] sArr = new char[256];
        char[] tArr = new char[256];

        for (int i = 0; i< s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            //check if sArr contains sChar
            //sChar - ' ' = ascii of sChar - ascii of space. i.e if sChar = a then 97-32(ascii of space) = index in array.
            if(sArr[sChar - ' '] != 0) {
                if(sArr[sChar - ' '] != tChar) {
                    return false;
                }
            }
            else{
                sArr[sChar - ' '] = tChar;
            }
            if(tArr[tChar-' '] != 0){
                if(tArr[tChar - ' '] != sChar){
                    return false;
                }
            }
            else{
                tArr[tChar - ' '] = sChar;
            }
        }
        return true;
    }
}