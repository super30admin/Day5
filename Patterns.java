//This problem takes time O(n) where n is the length of string pattern
// and size complexity is O(n + m) where again n is size of string pattern and m is the no of words on splitting the string with empty space
//we use the same approach as we did in previous problem. we map each character in a pattern to a word in the array.
// If the character is already mapped to another word or the word already exists we return false; else we return true.

import java.util.*;

class Patterns{
  private boolean findPatterns(String pattern, String str){
    HashMap<Character,String> map = new HashMap<>();
    String[] indivialWords = str.split(" ");
    if(indivialWords.length != pattern.length())
      return false;
    else{
      for(int i=0;i<pattern.length();i++){
        if(map.containsKey(pattern.charAt(i))) {
          if (!map.get(pattern.charAt(i)).equals(indivialWords[i]))
            return false;
        }
        else {
          if(map.containsValue(indivialWords[i]))
            return false;
          map.put(pattern.charAt(i), indivialWords[i]);
        }
      }
      return true;
    }
  }
  public static void main(String[] args) {
    Patterns p = new Patterns();
    String pattern = "abba";
    String str = "dog cat cat dog";
    boolean result = p.findPatterns(pattern,str);
    System.out.println(result);
  }
}