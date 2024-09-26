/*
 Time Complexity - O(n) where n is length of string s
 Space Complexity - O(1) As s contains only valid ascii characters, Hence the additional memory used for computation is also
                    fixed in size
Has it passed all test cases on leetcode - Yes
 */

 /*
  For s and t to be isomorphic, checking for two criteria:
  1)Mapping established for a certain character in s to t should hold true for all its occurences.
  2)No two characters from s can map to same character in t.
Considering two char Arrays of size 100 as we know string contains only valid ascii characters. We compute the indexes consistently
for all strings by subtracting ascii value of space from  the ascii value of the respective character.
sMap stores the mapping of ascii values of s to the character in t. If sMap already has mapping for a character and the character in t
doesn't match, its not isomorphic
tMap stores the mapping of ascii values of t to respective character in s.
*/

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || t == null) return false;
        if(s.length() != t.length()) return false;
        
        char[] sMap = new char[100];
        char[] tMap = new char[100];
        for(int i=0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sMap[sChar -' '] != 0){
                if(sMap[sChar-' '] != tChar){
                    return false;
                }
            }
            if(tMap[tChar -' '] != 0){
                if(tMap[tChar-' '] != sChar){
                    return false;
                }
            }
            sMap[sChar-' '] = tChar;
            tMap[tChar-' '] = sChar;
        }
        return true;
    }
}