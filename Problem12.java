//Time Complexity: O(n)
//Space Complexity: O(n)
//Did run on leetcode: Link not provided
//Problems faced any: No

import java.util.*;

public class Problem12 {
    public static boolean isIsomorphic(String s1, String s2){
        if(s1.length() != s2.length())
            return false;
        Map<Character, Character> compare = new HashMap<>();
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        for(int i=0; i< ch1.length; i++){
            if(compare.containsKey(ch1[i])){
                if(compare.get(ch1[i])!=ch2[i])
                    return false;
            }else
                compare.put(ch1[i],ch2[i]);
        }
        return true;
    }

    public static void main(String[] args){
        String s1 = "foo";
        String s2 = "baa";
        boolean a = isIsomorphic(s1,s2);
        System.out.println(a);
    }
}
