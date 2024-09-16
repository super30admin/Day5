// Time Complexity : O(n), n is number of words in string array
// Space Complexity : O(n),n is number of words in string array
// Did this code successfully run on Leetcode : yes


// approach : Split s into string array of words.Took one hashmap for storing character from pattern and word from string array as key-value pairs. then took additional hashset for storing words from string array.
//            I'll insert values into hashmap and before it i'll whether key is already present. If present i'll check if it matches with corresponding value. And also  inserting into hashset i'll check whether value is already present.
//            It shouldn't be present when i'm inserting a new pair

class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        if(pattern == null || s == null)
            return false;
        
        HashMap<Character,String> patternMap = new HashMap<>();
        HashSet<String> stringChecker = new HashSet<>();
        
        String[] sArray = s.split(" ");
        
        if(pattern.length() != sArray.length)
            return false;
        
        for(int i=0;i<pattern.length();i++ ){
            
            char c = pattern.charAt(i);
            if(patternMap.containsKey(c)){
                if(!patternMap.get(c).equals(sArray[i]))
                    return false;   
            }else{
                if(stringChecker.contains(sArray[i]))
                    return false;
                patternMap.put(c,sArray[i]);
                stringChecker.add(sArray[i]);
            }
        }
        return true;
    }
}