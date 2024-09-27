import java.util.*;

public class Problem2 {
    public boolean isIsomorphic(String one, String two) {
        HashMap<Character, Character> stringHashMapOne = new HashMap<Character, Character>();
        HashMap<Character, Character> stringHashMapTwo = new HashMap<Character, Character>();
          
       for(int i=0;i<one.length();i++) {
           Character oneChar = one.charAt(i);
           Character twoChar = two.charAt(i);
           
           if(stringHashMapOne.containsKey(oneChar) && !twoChar.equals(stringHashMapOne.get(oneChar))) {
               return false;
           } else {
               stringHashMapOne.put(oneChar, twoChar);
           }
           
           if(stringHashMapTwo.containsKey(twoChar) && !oneChar.equals(stringHashMapTwo.get(twoChar))) {
               return false;
           } else {
               stringHashMapTwo.put(twoChar, oneChar);
           }
       }
          return true;
      }

      public static void main(String[] args) {
        Problem2 isometric = new Problem2();
        boolean isFound = isometric.isIsomorphic("egg", "add");
        System.out.println("Is this isometric:" + isFound);

      }
}
