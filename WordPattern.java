/**Leetcode question 290 - Word Pattern */
/**Algorithm - Similar to Isomorphic Strings */
/**TC- O(n) - Number of the strings or alphabets in the given pattern or string
 * SC - O(M) - Number of uniques strings in the pattern
 */
public class WordPattern {
    class Solution {
        public boolean wordPattern(String pattern, String s) {
            if(s==null && pattern == null){
                return true;
            }
            String[] strArray = s.split(" ");
            if(pattern.length()!=strArray.length){
                return false;
            }
            HashMap<Character, String> pMap = new HashMap<>();
            HashSet<String> sSet = new HashSet<>();
            for(int i =0; i<pattern.length();i++){
                char c = pattern.charAt(i);
                String str = strArray[i];
                if(pMap.containsKey(c)){
                    if(!pMap.get(c).equals(str)){
                        return false;
                    }
                }
                else{
                    if(sSet.contains(str)){
                        return false;
                    }
                    pMap.put(c,str);
                    sSet.add(str);
                }
            }
            return true;
        }
    }
}
