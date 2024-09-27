// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Solution 1: 1st approach using 1 HashMap and 1 HashSet
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // base case
        if(s.length() != t.length()) return false;

        Map<Character, Character> hm = new HashMap<>();
        Set<Character> hs = new HashSet<>();

        // iterate each character in both strings
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(hm.containsKey(sChar)){
                // if hashmap already has key the we will check if the it's value is same again by comparing with tChar. If not that means both strings are not isomorphic and we will return false
                if(tChar != hm.get(sChar)){
                    return false;
                }
            }
            else {
                // if sChar not already present as key then it's should also mnot be present in our HashSet. It it's present that means both strings are not isomorphic and we will return false
                if(hs.contains(tChar)){
                    return false;
                }

                // just add in HashMap and HashSet
                hm.put(sChar, tChar);
                hs.add(tChar);
            }
        }

        return true;
    }
}

// Solution 2: 2nd approach using 2 HashMaps
// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         // base case
//         if(s.length() != t.length()) return false;

//         Map<Character, Character> sMap = new HashMap<>();
//         Map<Character, Character> tMap = new HashMap<>();

//         for(int i = 0; i < s.length(); i++) {
//             char sChar = s.charAt(i);
//             char tChar = t.charAt(i);

//             if(sMap.containsKey(sChar)){
//                 // if sMap conatains sChar as key that means it's value should match with tChar. If it does not match  that means both strings are not isomorphic and we will return false
//                 if(tChar != sMap.get(sChar)) {
//                     return false;
//                 }
//             }
//             else {
//                 // add in sMap pair of sChar(key) and tChar(value)
//                 sMap.put(sChar, tChar);
//             }

//             if(tMap.containsKey(tChar)) {
//                 // if tMap conatains tChar as key that means it's value should match with sChar. If it does not match that means both strings are not isomorphic and we will return false
//                 if(tMap.get(tChar) != sChar){
//                     return false;
//                 }
//             }
//             else {
//                 // add in tMap pair of tChar(key) and sChar(value)
//                 tMap.put(tChar, sChar);
//             }
//         }

//         return true;
//     }
// }

//         // Solution 3: 3rd approach using character arrays
// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         // base case
//         if(s.length() != t.length()) return false;

//         char[] sArray = new char[100];
//         char[] tArray = new char[100];

//         for(int i = 0; i < s.length(); i++) {
//             char sChar = s.charAt(i);
//             char tChar = t.charAt(i);

//             if(sArray[sChar - ' '] != 0) { // if it's not empty
//                 // if value present at that index is not matching with tChar then both strings are not isomorphic and we will return false
//                 if(sArray[sChar - ' '] != tChar) {
//                     return false;
//                 }
//             }
//             else {
//                 // if already present then update the value = tChar at that index
//                 sArray[sChar - ' '] = tChar;
//             }

//             if(tArray[tChar - ' '] != 0) { // if it's not empty
//                 // if value present at that index is not matching with sChar then both strings are not isomorphic and we will return false
//                 if(tArray[tChar - ' '] != sChar) {
//                     return false;
//                 }
//             }
//             else {
//                 // if already present then update the value = sChar at that index
//                 tArray[tChar - ' '] = sChar;
//             }
//         }

//         return true;
//     }
// }