/*
 Time Complexity - O(mk) where m is the length of pattern and k is the average length of words in string s
 Space Complexity - O(nk) where n is the number of words in string s after split by space
 Has it passed all testcases ? - Yes
 */
 /*
For s to follow the pattern- each character should map consistently to a word in s.
Creating a string array of size 26 to store the character to string mapping. Size 26 as it is given in the problem that it contains
only lowercase English characters.
Check if the character is already visited and if yes verify if its mapped to the same string as its last encounter. Otherwise it doesn't
follow pattern and return false;
If the character in pattern is not already visited and add its respective mapping from string s to the array at the index position 
obtained by subtracting ascii values char - 'a'.Along with that, also check to make sure that string is not mapped to multiple character in pattern
*/

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] strArr = s.split(" ");
        if(pattern.length() != strArr.length) return false;
        
        String[] patternMap = new String[26];
        HashMap<String,Character> sMap = new HashMap<>();
        for(int i =0; i< pattern.length(); i++){
            char pChar = pattern.charAt(i);
            String str = strArr[i];
            if(patternMap[pChar-'a'] != null 
               && !str.equals(patternMap[pChar - 'a'])){
                return false;
            }
            if(sMap.containsKey(str)){
                if(sMap.get(str) != pChar){
                    return false;
                }
            }
            else{
                sMap.put(str,pChar);
            }
            patternMap[pChar-'a'] = str;
        }
        return true;
    }
}
