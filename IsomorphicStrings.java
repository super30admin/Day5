// Time Complexity : All the operations are done in O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH 1: Using 2 hashMaps
1. if s' character is present in s to t hashmap, check for corresponding value; if character is not present in hashmap, add new entry.
2. if t' character is present in t to s hashmap, check for corresponding value; if character is not present in hashmap, add new entry.

APPROACH 2: Using 2 character arrays
Using char's ASCII value - 'a' ASCII value as hash function
1. check the character at index - hash value of first char, if not equal return false. else add a new entry;
2. check the character at index - hash value of second char, if not equal return false. else add a new entry;

APPROACH 3: Using hashmap and hashset
1. if character is present in hashmap, check for corresponding value;
2. if character is not present in hashmap, check for corresponding value in hashset before creating a new entry in hashmap;
*/

import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {

        // APPROACH 3: HashMap and HashSet
        HashMap<Character, Character> stotMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

        if(s.length() != t.length()) return false;
        if(null == s || null == t || s.length() == 0 || t.length() == 0) return false;

        for(int i=0; i<s.length(); i++){
            if(!stotMap.containsKey(s.charAt(i))){
                if(tSet.contains(t.charAt(i))) return false;
                stotMap.put(s.charAt(i), t.charAt(i));
                tSet.add(t.charAt(i));
            } else {
                if(stotMap.get(s.charAt(i)) != t.charAt(i)) return false;
            }
        }
        return true;

        // APPROACH 2: 2 character arrays
//         char[] stotMap = new char[100];
//         char[] ttosMap = new char[100];

//         if(s.length() != t.length()) return false;
//         if(null == s || null == t || s.length() == 0 || t.length() == 0) return false;

//         for(int i=0; i<s.length(); i++){
//             if(stotMap[s.charAt(i) -' ']==0){
//                 stotMap[s.charAt(i) -' '] = t.charAt(i);
//             } else {
//                 if(stotMap[s.charAt(i) -' '] != t.charAt(i)) return false;
//             }

//             if(ttosMap[t.charAt(i) -' ']==0){
//                 ttosMap[t.charAt(i) -' '] = s.charAt(i);
//             } else {
//                 if(ttosMap[t.charAt(i) -' '] != s.charAt(i)) return false;
//             }
//         }
//         return true;



// APPROACH 1: 2 HashMaps
//         HashMap<Character, Character> stotMap = new HashMap<>();
//         HashMap<Character, Character> ttosMap = new HashMap<>();

//         if(s.length() != t.length()) return false;
//         if(null == s || null == t || s.length() == 0 || t.length() == 0) return false;

//         char[] sCharArray = s.toCharArray();
//         char[] tCharArray = t.toCharArray();
//         for(int i=0; i<s.length(); i++){
//             if(!stotMap.containsKey(sCharArray[i])){
//                 stotMap.put(sCharArray[i], tCharArray[i]);
//             } else {
//                 if(stotMap.get(sCharArray[i]) != tCharArray[i]) return false;
//             }

//             if(!ttosMap.containsKey(tCharArray[i])){
//                 ttosMap.put(tCharArray[i], sCharArray[i]);
//             } else {
//                 if(ttosMap.get(tCharArray[i]) != sCharArray[i]) return false;
//             }
//         }
//         return true;
    }

    public static void main(String[] args){
        String s = "egg", t = "add"; //true
        System.out.println(isIsomorphic(s, t));

        String s2 = "foo", t2 = "bar"; //false
        System.out.println(isIsomorphic(s2, t2));

        String s3 = "paper", t3 = "title"; //true
        System.out.println(isIsomorphic(s3, t3));
    }
}
