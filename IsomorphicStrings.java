import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {

    //Time Complexity: 0(n)
    //Space complexity: 0(1)
    //Did it successfully run on leetcode: Yes
    //Did you face any problems: No

    //In short explain your approach: I took a hashmap to map the character of string s and a hashset to map
    //the character of t string. If the character is not present in hashmap, the program goes ahead and adds
    //the character to the hashmap for s string. Then it checks if the character from t string is present
    //or not in the hashset. If it is, that means the s character has already been mapped previously.
    //If not, then it goes ahead and adds the character from t srtring to the hashset. Finally, if the character
    //is already present in the hashmap, it checks if the s string character has the same value or not in the
    //hashmap, if yes then the loop continues, if not, then it throws a false i.e. its already mapped to some
    //other character.

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashSet<Character> tset = new HashSet<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(!smap.containsKey(schar)){
                smap.put(schar, tchar);
                if(tset.contains(tchar)){
                    return false;
                }
                tset.add(tchar);
            }
            else{
                if(smap.get(schar) != tchar){
                    return false;
                }
            }

        }
        return true;
    }
}
