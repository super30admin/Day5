import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Hashing {
    // time complexity: N
    // spacecomplexity: N
    //Did it run on leetcode: yes
    // any issues with this problem: no
    //Leetcode: 49 Group anagram
    //https://leetcode.com/problems/group-anagrams/
    public List<List<String>> groupAnagrams(String[] strs) {
       if(strs== null || strs.length==0) return new ArrayList<>();
        HashMap<Double,List<String>> map = new HashMap<>();
       for(String s: strs){
           double key = getPrimeProduct(s);
           if(!map.containsKey(key)){
               map.put(key, new ArrayList<>());
           }
           map.get(key).add(s);
       }
       return new ArrayList<>(map.values());
       
    }
    private static double getPrimeProduct(String s){
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double primeproduct=1;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            primeproduct = primeproduct* prime[c-'a'] ; 
        }
        return primeproduct;
    }
    // time complexity: N
    // spacecomplexity: o(1)
    //Did it run on leetcode: yes
    // any issues with this problem: no
    //205. Isomorphic Strings
    //https://leetcode.com/problems/isomorphic-strings/
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!= t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashSet<Character> tset = new HashSet();
        for(int i=0;i<s.length();i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if(sMap.containsKey(sChar)){
                if(sMap.get(sChar) !=  tChar){
                    return false;
                }
            }else{
                if(tset.contains(tChar)){
                    return false;
                }else{
                    sMap.put(sChar, tChar);
                    tset.add(tChar);
                }
            }
        }
        return true;
    }
    // time complexity: N
    // spacecomplexity: o(1)
    //Did it run on leetcode: yes
    // any issues with this problem: no
    //290. Word Pattern
    //https://leetcode.com/problems/word-pattern/
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(pattern.length() != strs.length) return false;
        HashMap<Character,String> map = new HashMap<>();
        
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            Character chr = pattern.charAt(i);
            String str = strs[i];
            if(map.containsKey(chr)){
                if(!map.get(chr).equals(str)){
                    return false;
                }
            }else{
                if(set.contains(str)){
                    return false;
                }else{
                    map.put(chr,str);
                    set.add(str);
                }
            }
        }
        return true;

    }

}
