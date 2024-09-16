// Problem 3:

/*
  Nilesh Deokar
  Time :
  Space :
*/

import java.util.*;

class StringFollowsPattern{
// Input: pattern = "abba", str = "dog cat cat dog"

    public static void main(String[] args){
      // String pattern = "abba"; String str = "dog cat cat dog";
      // String pattern = "abba"; String str = "dog cat cat fish";
      // String pattern = "aaaa"; String str ="dog cat cat dog";
      String pattern = "abba"; String str = "dog dog dog dog";

      System.out.printf("str follows patterns : %b \n", hasPattern(pattern, str));
    }

    private static boolean hasPattern(String pattern, String str){
      if(pattern == null || str == null) return false;
      HashMap<Character, String> patternMap = new HashMap<Character, String>();
      HashMap<String, Character> strMap = new HashMap<String, Character>();


      String[] strArray = str.split(" ");
      if(strArray.length != pattern.length())
        return false;
      
      for(int i = 0; i < pattern.length(); i++){
        char c = pattern.charAt(i);
        if(patternMap.containsKey(c) && !patternMap.get(c).equals(strArray[i])){
          return false;
        }

        if(strMap.containsKey(strArray[i]) && strMap.get(strArray[i]) != c){
          return false;
        }

        strMap.put(strArray[i], c);
        patternMap.put(c, strArray[i]);
      }

      for( int i = 0; i < pattern.length(); i++){
        char c = pattern.charAt(i);
        if(!strArray[i].equals(patternMap.get(c))){
          return false;
        }
      }

      return true;
    }
}
