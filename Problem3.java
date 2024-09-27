import java.util.*;

public class Problem3 {
    public boolean wordPattern(String pattern, String s) {
    
        HashMap<Character, String> patternHashMap = new HashMap<Character, String>();
          HashMap<String, Character> stringHashMap = new HashMap<String, Character>();
          
          String[] stringArray = s.split(" ");
          if(pattern.length() != stringArray.length){
              return false;
          }
          for(int i=0; i<pattern.length(); i++){ 
              char patternChar = pattern.charAt(i);
              String stringValue = stringArray[i];
              if(patternHashMap.containsKey(patternChar) && !stringValue.equals(patternHashMap.get(patternChar))) { 
                  return false;
              }
              else {
                  patternHashMap.put(patternChar, stringValue);
              }
              
              if(stringHashMap.containsKey(stringValue) && !stringHashMap.get(stringValue).equals(patternChar)) {
                  return false;
              } else {
                  stringHashMap.put(stringValue, patternChar);
              }
          }
          return true;
      }

      public static void main(String[] args) {
        Problem3 isometric = new Problem3();
        boolean isFound = isometric.wordPattern("abba", "dog cat cat dog");
        System.out.println("The word pattern is same :" + isFound);

      }
}
