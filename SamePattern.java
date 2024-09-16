//Time Complexity: O(n)
// Space Complexity: O(n)
// Program ran on leetcode successfully. 

class SamePattern {
    public boolean wordPattern(String pattern, String s) {
        String[] sArray= s.split(" ");  
 
        if(sArray.length != pattern.length())
            return false;
 
        HashMap<Character, String> patternMap = new HashMap<Character, String>();
        
        for(int i=0; i<pattern.length(); i++) {
            char charKey = pattern.charAt(i);
            if(patternMap.containsKey(charKey)){
                String strVal = patternMap.get(charKey);
                if(!strVal.equals(sArray[i])){
                    
                    return false;
                }
            }else if (patternMap.containsValue(sArray[i])){
                return false;
            }
            patternMap.put(charKey, sArray[i]);
        }

        return true;
        }
}