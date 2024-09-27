
//Time complexity = O(n) n is length of s or t
//Space complexity = O(1)
/*Approach
*mapping both the string to each other in separate maps
* if char is occuring first time we will store it and its correspondence in the map
* storing corresponding char from both s and t if map contains key from s its corresponding value should match 
value at position(i) of t if not we will return false
*same from other side which is t to s otherwise it may create problems in some cases
*/
import java.util.HashMap;

public class IsomorphicString {
    public static boolean check(String s, String t){
        HashMap<Character, Character> map1 = new HashMap<>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length();i++){
            if(map1.containsKey(s.charAt(i))){
                if(map1.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            map1.put(s.charAt(i),t.charAt(i));
        }
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int i = 0; i < t.length();i++){
            if(map2.containsKey(t.charAt(i))){
                if(map2.get(t.charAt(i)) != s.charAt(i)) return false;
            }
            map2.put(t.charAt(i),s.charAt(i));
        }
        return true;

    }
    public static void main(String args[]){
        System.out.println(check("abba","eeee"));
        System.out.println(check("abba","eppe"));
        System.out.println(check("aba","eeee"));
        
    }
}