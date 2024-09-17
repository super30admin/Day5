package S30.Hashing_1;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {

    //Algorithm checks if character matches correctly to a particular string, and no other character matches to that string
    public boolean wordPattern(String pattern, String s) {

        if(pattern == null || s == null || pattern.length() == 0 || s.length() == 0) return false;

        HashMap<Character,String> map = new HashMap<Character,String>();
        HashSet<String> seen = new HashSet<>();

        String[] strArr = s.split("\\s");

        if(strArr.length != pattern.length()) return false;
        int len = pattern.length();
        for(int i = 0; i < len; i++){

            String str = strArr[i];
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(str)) return false;
            }else{
                if(seen.contains(str)) return false;
                map.put(c,str);
                seen.add(str);
            }
        }

        return true;

    }

    public static void main(String[] args) {
        WordPattern testClass = new WordPattern();
        System.out.println(testClass.wordPattern("abba", "dog cat cat dog"));
        System.out.println(testClass.wordPattern("abba", "dog dog dog dog"));
    }
}
