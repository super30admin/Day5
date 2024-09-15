// Time Complexity : O(n) where n is number of chars
// Space Complexity : O(1) because number of keys is going to be constant in HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
        char[] cPattern = pattern.toCharArray();
        String[] sArr = s.split(" ");
        HashMap<Character,String> hm = new HashMap<>();
        HashSet<String> hs = new HashSet<>();
        
        if(cPattern.length != sArr.length) {
            return false;
        }
        
        for(int i = 0; i< sArr.length; i++) {
            if(!hm.containsKey(cPattern[i])) { //if the char is not present in hashmap
                if( hs.contains(sArr[i]) ) {
                    return false;
                }
                hm.put(cPattern[i],sArr[i]);
                hs.add(sArr[i]);
            }
            else if(! hm.get(cPattern[i]).equals(sArr[i]) ) {
                return false;
            }
        }
        return true;
    }
}