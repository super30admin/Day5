import java.util.HashMap;
import java.util.HashSet;

public class WordPattern {
//    Time Complexity : O(n) n--> length of string s not the pattern
//    Space Complexity : O(1) since hashmap has 26 characters
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(pattern==null || s==null || strs.length != pattern.length())
            return false;
        HashMap<Character,String> patternMap = new HashMap();
        HashSet<String> hashSet = new HashSet<>();
        for(int i=0;i<strs.length;i++){
            char c = pattern.charAt(i);
            if(patternMap.containsKey(c)){
                if(!patternMap.get(c).equals(strs[i]))
                    return false;
            }else{
                patternMap.put(c,strs[i]);
                if(hashSet.contains(strs[i])){
                    return false;
                }
                hashSet.add(strs[i]);
            }
        }
        return true;
    }

     public boolean wordPatternUsingHashMap(String pattern, String s) {
//    Time Complexity : O(n) n--> length of string s not the pattern
//    Space Complexity : O(1) since hashmap has 26 characters
         String[] strs = s.split(" ");
         if(pattern==null || s==null || strs.length != pattern.length())
             return false;
         HashMap<Character,String> patternMap = new HashMap();
         HashMap<String,Character> map = new HashMap();
         for(int i=0;i<strs.length;i++){
             char c = pattern.charAt(i);
             if(map.containsKey(strs[i])){
                 if(map.get(strs[i]) != c){
                     return false;
                 }

             }else{
                 map.put(strs[i],c);
             }

             if(patternMap.containsKey(c)){
                 if(!patternMap.get(c).equals(strs[i]))
                     return false;
             }
             else{
                 patternMap.put(c,strs[i]);
             }

         }
         return true;
     }
}
