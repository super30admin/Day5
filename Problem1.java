import java.util.HashMap;


// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


//Approach is to use 2 hashMap to store the character of s mapped to character t and vice versa.
public class Problem1 {
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public boolean isIsomorphic1(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            //
            if(sMap.containsKey(s.charAt(i))){
                if(sMap.get(s.charAt(i)) != t.charAt(i)) return false;
            }else{
                sMap.put(s.charAt(i),t.charAt(i));
            }
            if(tMap.containsKey(t.charAt(i))){
                if(tMap.get(t.charAt(i)) != s.charAt(i)) return false;
            }else{
                tMap.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }


    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public boolean isIsomorphic2(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] sHmap = new char[256];
        char[] tHmap = new char[256];//we'll use hashing in form of s.charAt(i)-'a'
        // HashMap<Character,Character> sHmap = new HashMap<>();
        // HashMap<Character,Character> tHmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(sHmap[s.charAt(i)] != 0){
                if(sHmap[s.charAt(i)] != t.charAt(i)) return false;
            }
            else{
                sHmap[s.charAt(i)]=t.charAt(i);
            }
        }
        for(int i=0;i<t.length();i++){
            if(tHmap[t.charAt(i)] != 0){
                if(tHmap[t.charAt(i)] != s.charAt(i)) return false;
            }
            else{
                tHmap[t.charAt(i)]=s.charAt(i);
            }
        }
        return true;
    }

    
}