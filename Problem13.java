//Time Complexity: O(n)
//Space Complexity: O(n)
//Did run on leetcode: Link not provided
//Problems faced any: No

import java.util.*;

public class Problem13 {
    public boolean isIsomorphic2(String s1, String s2){
        Map<Character, String> compare = new HashMap<>();
        char[] ch1 = s1.toCharArray();
        String[] st2 = s2.split(" ");
        if(ch1.length != st2.length)
            return false;
        for(int i=0; i< ch1.length; i++){
            if(compare.containsKey(ch1[i])){
                if(!compare.get(ch1[i]).equals(st2[i])){
                    return false;
                }

            }else {
                if(compare.containsValue(st2[i]))
                    return false;
                compare.put(ch1[i], st2[i]);
            }
        }
        return true;
    }

    public static void main(String[] args){
        Problem13 p = new Problem13();
        String s1 = "abba";
        String s2 = "dog cat cat dog";
        boolean a = p.isIsomorphic2(s1,s2);
        System.out.println(a);
    }
}
