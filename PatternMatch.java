//pattern match
//problem 3:
//Given a pattern and a string str, find if str follows the same pattern.
//Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

// Example 1:
// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true

// Example 2:
// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", str = "dog cat cat dog"
// Output: false

// Example 4:
// Input: pattern = "abba", str = "dog dog dog dog"
// Output: false
// Notes:
// You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
import java.util.HashMap;

public class PatternMatch {

    //explaination: 
    //1. follow the pattern and check if the word in the string is the same as the pattern
    //2. if the word is not the same as the pattern, return false
    //3. if the word is the same as the pattern, return true
    public boolean wordPattern(String pattern, String s) {
   
        String[] words = s.split(" ");

        if (words.length != pattern.length()) {
            return false;
        

    HashMap<Character,String> map = new HashMap<>();
    HashMap<String, Character> map2 = new HashMap<>();
    int lastStringEndPos =0;
    for (int i =0; i< pattern.length(); i++){
        //extract
        String checkString = "";
        int j = -1;
        for (j =lastStringEndPos; j< s.length(); j++){
            if (s.charAt(j) == ' '){
            checkString = s.substring(lastStringEndPos, j);
                lastStringEndPos = j+1;
                break;
            }
            if (j == s.length() -1){
                checkString = s.substring(lastStringEndPos, j+1);
            }
        }

            // System.out.println("checkString:" + checkString);
            if (!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i), checkString);
            } else {
                if (!map.get(pattern.charAt(i)).equals(checkString)){
                    return false;
                }
            }
            if(!map2.containsKey(checkString)){
                map2.put(checkString,pattern.charAt(i));
            } else if (!map2.get(checkString).equals(pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }
   
 public static void main(String[] args) {
    PatternMatch pm = new PatternMatch();
    System.out.println(pm.wordPattern("abba", "dog cat cat dog")); //true
    System.out.println(pm.wordPattern("abba", "dog cat cat fish")); //false
    System.out.println(pm.wordPattern("aaaa", "dog cat cat dog")); //false
    System.out.println(pm.wordPattern("abba", "dog dog dog dog")); //false

 }
}

