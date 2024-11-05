// Time Complexity : O (n) n is the char in s
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach : using a hashmap
// to store char and the corresponding string in the map. If it is same then we continue or else
//we return false


import java.util.*;

/**
 * PatternMatching : PatternMatching
 *
 * @author : Kavya Mandaliya (kmandali@cisco.com)
 * @version : 1.0 (Nov 04, 2024)
 * @since : 1.0 (Nov 04, 2024)
 */
public class PatternMatching {

   public static boolean isMatch(String s, String p) {
       Map<Character, String> map = new HashMap<>();
       String str[] = p.split(" ");
       int i = 0;
       for(char c: s.toCharArray()) {
          if(map.containsKey(c)) {
              if(!map.get(c).equals(str[i])) return false;
          }else{
              map.put(c, str[i]);
          }
          i++;
       }
       return true;
   }

   public static void main(String[] args) {
       System.out.println(isMatch("abba", "cat dog dog cat"));
       System.out.println(isMatch("abba", "dog cat cat fish"));
       System.out.println(isMatch("aaaa", "dog cat cat fish"));

   }
}
