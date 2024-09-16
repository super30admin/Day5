/*
Author: Akhilesh Borgaonkar
Problem: Given a pattern and a string str, find if str follows the same pattern.
Approach: Using hashing technique here to find if the current character in string pattern is already mapped to a string in splitted str.
    Using two hashmaps here to having both way mapping of characters from pattern & str strings.
Time Complexity: O(n) where n is length of pattern string.
Space complexity: O(1) constant as in worst we will have 26 entries for each alphabet in hashmap.
LC Verified.
*/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] splits = str.split(" ");
        HashMap<String, Character> map1 = new HashMap<>();  //map for storing original mapping
        HashMap<Character, String> map2 = new HashMap<>();  //map for storing mirrored mapping
        
        if(splits.length != pattern.length())               //if input pattern and number of words in str is unequal then they are not isomorphic
            return false;
        
        for(int i=0; i<pattern.length(); i++){
            Character patCurr = pattern.charAt(i);
            String strCurr = splits[i];
            
            if(map1.containsKey(strCurr)){                  //check if the mapping for string to pattern is already present
                if(!map1.get(strCurr).equals(patCurr)){     //if yes then check if the mapped pattern is the same string
                    return false;
                }
            } else {
                map1.put(strCurr, patCurr);                 //else add new mapping to hashmap
            }
            
            if(map2.containsKey(patCurr)){                  //similarly check in the mirrored map
                if(!map2.get(patCurr).equals(strCurr)){
                    return false;
                }
            } else {
                map2.put(patCurr, strCurr);
            }
        }
        
        return true;                            //if no mismatched mapping found then the string matches the pattern
    }
}