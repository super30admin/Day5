
//time complexity : O(n) n=length of s
//space complexity ; O(n)
//I don't face any problems
//runs successfully on leetcode



import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicStrings205LeetCode {

    public boolean isIsomorphic(String s, String t) {

        int i=0;
        Map<Character, Character> map = new HashMap<>();                //creating map
        Set<Character> set = new HashSet<>();                           //creating set

        while(i<s.length()){

            char temp1 = s.charAt(i);                                   //getting the each character from string s
            char temp2 = t.charAt(i);                                   //getting the each character from string t

            if(!map.containsKey(temp1)){                            //check if character of s string is present in map
                if(!set.contains(temp2)){                       //if not then check if character of t string is present in set
                    map.put(temp1, temp2);                  //if not then add element in map and set
                    set.add(temp2);
                }
                else{                                   //if character is not present in set then return false
                    return false;
                }
            }

            if(map.get(temp1)!=temp2){                  //if character is present in map, then get the value of that key and compare the value with t string character
                return false;
            }
            i++;

        }
        return true;
    }
}
