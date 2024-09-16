// Time Complexity : O(n)
// Space Complexity : O(n) // space occupied by string array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Using Two HashMap
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || pattern.length() == 0)
            return false;
         
         Map<Character, String> pMap = new HashMap<>();
         Map<String, Character> sMap = new HashMap<>();
         
         String strs[] = s.split(" ");
         
         if(pattern.length() != strs.length)
             return false;
         
         for(int i = 0 ; i < pattern.length(); i ++)
         {
             char pChar = pattern.charAt(i);
             String sChar = strs[i];
             
             if(pMap.containsKey(pChar))
             {
                if(!pMap.get(pChar).equals(sChar))
                    return false;
             }
             else
             {
                 pMap.put(pChar, sChar);   
             }
             if(sMap.containsKey(sChar))
             {
                if(sMap.get(sChar) != pChar)
                    return false;
             }
             else
             {
                 sMap.put(sChar, pChar);   
             }
         }
         
         return true;
     }
}
// Using HashMap and HashSet
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern == null || pattern.length() == 0)
            return false;
         
         Map<Character, String> pMap = new HashMap<>();
         Set<String> set = new HashSet<>();
         
         String strs[] = s.split(" ");
         
         if(pattern.length() != strs.length)
             return false;
         
         for(int i = 0 ; i < pattern.length(); i ++)
         {
             char pChar = pattern.charAt(i);
             String str = strs[i];
             
              
             if(pMap.containsKey(pChar))
             {
                if(!pMap.get(pChar).equals(str))
                    return false;
             }
             else
             {
                 if(set.contains(str))
                 {
                        return false;
                 }
                 pMap.put(pChar, str);   
                 set.add(str);
             }
         }
         
         return true;
     }
}