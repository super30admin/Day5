//Time Complexity: O(n)
//Space Complexity: o(K)
//LeetCode: Yes

//Initialise two hashmaps to reduce the complexity. Map the characters of the pattern word to the word of the string and inverse map. 
//Check for the key in both the maps. Return boolean based on result.  

class Solution {
    public boolean wordPattern(String pattern, String str) {
         Map<Character, String> pmap = new HashMap<>();
         Map<String, Character> strmap = new HashMap<>();
         char[] lc = pattern.toCharArray();
         String[] ls = str.split(" ");
         if (lc.length != ls.length) {
             return false;
         }
 
         for (int i = 0; i < lc.length; ++i) {
             if (pmap.containsKey(lc[i])) {
                 if (!pmap.get(lc[i]).equals(ls[i])) {
                     return false;
                 }
             } else {
                 if (strmap.containsKey(ls[i])) {
                     if (strmap.get(ls[i]) != lc[i]) {
                         return false;
                     }
                 } else {
                     pmap.put(lc[i], ls[i]);
                     strmap.put(ls[i], lc[i]);
                 }
             }
         }
         return true;
     }
 }