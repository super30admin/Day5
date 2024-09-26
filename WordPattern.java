/*
/*
// time complexity: O(n)
// space ccomplexity; O(n) , for map and set
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
*/
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
        //first check if they have same length
        int n1 = pattern.length();
        
        String[]strArray = s.split(" ");
        int n2 = strArray.length;
        
        
        
        if(n1 != n2){
           return false;
        }
        
        //Hashmap to save the mappings of pattern to string
        
        HashMap<Character, String> patternMap = new HashMap<>();
        HashSet<String> visited = new HashSet<>();
        
        for(int i = 0; i < pattern.length();i++){
            char c = pattern.charAt(i);
            String currStr = strArray[i];
            if(!patternMap.containsKey(c)){
                if(visited.contains(currStr)){
                    return false;
                }
                else{
                    patternMap.put(c, currStr);
                    visited.add(currStr);
                }
           
            }
            else{
                String value = patternMap.get(c);
                if(!currStr.equals(value)){
                    return false;
                }
                
            }
                
          }
        return true;
    }
}

