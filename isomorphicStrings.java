/*
*Time complexity: O(n)
*Space Complexity: O(n)
*Accepted on leetcode
*Description of the approach: Here, I'm creating two maps to map corresponding characters of S and T. whereever the mapping and reversemapping doesn't match, 
*then we know the strings aren't isomorphic and break the loop by returning false.
*/
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length())return false;
        Map<Character, Character> mapping = new HashMap<>();
        Map<Character, Character> reverseMapping = new HashMap<>();

        for (int i=0;i<s.length();i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (!mapping.containsKey(schar) ){
                mapping.put(schar, tchar);
                
            }
            if(!reverseMapping.containsKey(tchar)){
                reverseMapping.put(tchar,schar);
            }
            // else if(reverseMapping.containsKey(tchar)){
            //     reverseMapping.put(tchar,schar);
            // }
            if(mapping.get(schar)!=tchar || reverseMapping.get(tchar)!=schar)
                    return false;
            }
        return true;
    }
        
}
