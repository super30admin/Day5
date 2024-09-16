import java.util.HashMap;
import java.util.HashSet;

// Time Complexity : O(N) where N is the number of characters
// Space Complexity : O(1), since there are constant number of alphabet characters
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.

// Your code here along with comments explaining your approach
/*
1. Use HashMap to store tchar: schar mapping and schar: tchar mapping. If not 1:1 mapping return false
2. Use HashMap to store s characters and HashSet to add t characters, if no 1:1 mapping or if dupes are being added to set
return false
* */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()*t.length()==0) return true;

        if(s.length()!=t.length()) return false;

        HashMap<Character, Character> smap= new HashMap<>();
        HashMap<Character,Character> tmap= new HashMap<>();
        for(int i=0;i<s.length();i++){
            smap.put(s.charAt(i),t.charAt(i));
            tmap.put(t.charAt(i),s.charAt(i));
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!= tmap.get(t.charAt(i))) return false;
            if(t.charAt(i)!= smap.get(s.charAt(i))) return false;
        }

        return true;
    }

    public boolean isIsomorphic2(String s, String t) {
        if(s.length()*t.length()==0) return true;

        if(s.length()!=t.length()) return false;

        HashMap<Character, Character> smap= new HashMap<>();
        HashMap<Character,Character> tmap= new HashMap<>();

        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if(!smap.containsKey(schar)){
                smap.put(schar,tchar);
            }else{
                if(smap.get(schar)!=tchar) return false;
            }

            if(!tmap.containsKey(tchar)){
                tmap.put(tchar,schar);
            }else{
                if(tmap.get(tchar)!=schar) return false;
            }
        }

        return true;
    }

    public boolean isIsomorphicSet(String s, String t) {
        if(s.length()*t.length()==0) return true;

        if(s.length()!=t.length()) return false;

        HashMap<Character, Character> smap= new HashMap<>();
        HashSet<Character> set= new HashSet<>();

        for(int i=0;i<s.length();i++){
            char schar=s.charAt(i);
            char tchar=t.charAt(i);
            if(!smap.containsKey(schar)){
                smap.put(schar,tchar);
                if(set.contains(tchar)) return false;
                set.add(tchar);
            }else{
                if(smap.get(schar)!=tchar) return false;
            }
        }

        return true;
    }
}
