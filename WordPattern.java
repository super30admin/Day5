// Time Complexity : O(n) where n is size of pattern
// Space Complexity :O(n) where n is size of strings
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strArray = str.split(" ");
        
        if(pattern.length()!= strArray.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        int i=0;
        
        
        //characters in pattern are keys
        //characters in strArray are values
        while(i<pattern.length())
        {
            if(!map.containsKey(pattern.charAt(i)))           
            {
                if(map.containsValue(strArray[i]))     
                    return false;
                map.put(pattern.charAt(i),strArray[i]);       
            }
            else
            {
                if(!map.get(pattern.charAt(i)).equals(strArray[i]))   
                    return false;
            }
            i++;
        }
        return true;
        
    }
}