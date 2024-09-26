// Time Complexity : O(n)
// Space Complexity :O(1) // because array lenght is of constant size of 26 of so.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// for hashmap method create the hashmap of both the s and t strings and compare the isomorphic characters
// for array do the same thing, just insted of hashmap do the array implentation
// Your code here along with comments explaining your approach

// without hashMap
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        char [] sArray = new char [100];
        char [] tArray = new char [100];
        for( int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sArray[sChar - ' '] != 0){
                if(sArray[sChar - ' '] != tChar) return false;
            }else{
                sArray[sChar - ' '] = tChar;
            }
            if(tArray[tChar - ' '] != 0){
                if(tArray[tChar - ' '] != sChar) return false;
            }else{
                tArray[tChar - ' '] = sChar;
            }
        }
        return true;
    }
}


// hashmap method
// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         if( s.length() != t.length()) return false;
//         HashMap <Character, Character> sHM = new HashMap<>();
//         HashMap <Character, Character> tHM = new HashMap<>();
//         for(int i = 0; i<s.length(); i++){
//             char sChar = s.charAt(i);
//             char tChar = t.charAt(i);
//             if(sHM.containsKey(sChar)){
//                 if(sHM.get(sChar) != tChar) return false;
//             }else{
//                 sHM.put(sChar,tChar);
//             }
//             if(tHM.containsKey(tChar)){
//                if( tHM.get(tChar) != sChar) return false;
//             }else{
//                 tHM.put(tChar,sChar);
//             }
//         }
//         return true;
//     }
// }