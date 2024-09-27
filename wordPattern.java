/*
*Time complexity: O(n)
*Space Complexity: O(n)
*Accepted on leetcode
*Description of the approach: Here, I'm creating two maps to map corresponding characters of character pattern and whitespace separated string. 
*Whereever the mapping and reversemapping doesn't match, then we know the pattern doesnt match and break the loop by returning false.
*/
class Solution {
    public boolean wordPattern(String pattern, String str) {        
        if (pattern.length() != str.split(" ").length)
            return false;
        Map<Character, String> mapping = new HashMap<>();
        Map<String, Character> reverseMapping = new HashMap<>();
        String[] strArray = str.split(" ");
        for (int i=0;i<pattern.length();i++){
            char schar = pattern.charAt(i);
            String tString = strArray[i];
            if (!mapping.containsKey(schar)){
                mapping.put(schar, tString);
                
            }
            if(!reverseMapping.containsKey(tString)){
                reverseMapping.put(tString,schar);
            }
            
            if(!mapping.get(schar).equals(tString) || reverseMapping.get(tString) != schar){

                return false;
            }
                    
            }
        return true;
    
    }
}
