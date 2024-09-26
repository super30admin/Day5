// Time Complexity: O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        if(s == null && t == null)
            return true;
        //Two HashMap
        // HashMap<Character, Character> sMap = new HashMap<>();
//         HashMap<Character, Character> tMap = new HashMap<>();
        
//         for(int i = 0; i < s.length(); i++){
//             char sChar = s.charAt(i);
//             char tChar = t.charAt(i);
            
//             if(sMap.containsKey(sChar)){
//                 if(tChar != sMap.get(sChar))
//                     return false;
//             }
//             else
//                 sMap.put(sChar,tChar);
//             if(tMap.containsKey(tChar)){
//                 if(sChar != tMap.get(tChar))
//                     return false;
//             }
//             else
//                 tMap.put(tChar,sChar);
//         }
        //HashMap and HashSet
//         HashMap<Character, Character> sMap = new HashMap<>();
//         HashSet<Character> set = new HashSet<>();
        
//         for(int i = 0; i < s.length(); i++){
//             char sChar = s.charAt(i);
//             char tChar = t.charAt(i);
//             if(sMap.containsKey(sChar)){
//                 if(tChar != sMap.get(sChar))
//                     return false;
//             }
//             else if(set.contains(tChar))
//                 return false;
//             else{
//                 sMap.put(sChar, tChar);
//                 set.add(tChar);
//             }
//         }
        //2 Character Arrays
        char[] sArray = new char[100];
        char[] tArray = new char[100];
        
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sArray[sChar - ' '] != 0){
                if(sArray[sChar - ' '] != tChar)
                    return false;
            }
            else{
                sArray[sChar - ' '] = tChar;
            }
            if(tArray[tChar - ' '] != 0){
                if(tArray[tChar - ' '] != sChar)
                    return false;
            }
            else{
                tArray[tChar - ' '] = sChar;
            }
            
        }
        return true;
    }
}
