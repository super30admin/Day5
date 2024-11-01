// Time Complexity :wordPattern: O(2n)=O(n) , n is  number of characters in the string
// Space Complexity :0(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nothing

import java.util.HashMap;
import java.util.HashSet;

public class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        HashMap<Character,String> map= new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for(int i=0; i<pattern.length(); i++){
            char pChar = pattern.charAt(i);
            if(map.containsKey(pChar)){
                if(!map.get(pChar).equals(words[i])) return false;
            } else{
                if(set.contains(words[i])) return false;
                set.add(words[i]);
                map.put(pChar,words[i]);
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Problem3 problem3= new Problem3();
        String pattern= "abba";
        String s= "dog dog dog dog";
        System.out.println("pattern match found "+problem3.wordPattern(pattern,s));

    }
}
