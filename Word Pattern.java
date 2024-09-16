/*Time complexity : O(n). The number of characters in the pattern or the length of the pattern.
Space Complexity  : O(k). Taking into consideration of number of words in string 's'. Also, it could be O(1) as the total number of characters is
constant which is 26
 */
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if(pattern==null && s == null){
            return true;
        }
        // split the string 's' by space and convert it to array
        String[] str = s.split(" ");
        //if the pattern length and string length does not match then false
        if(pattern.length() != str.length){
            return false;
        }
        //use map to store the character and its string value
        Map<Character,String> map = new HashMap<>();
        //set is used to store thr string values
        Set<String> set = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            //if map conatins the character from pattern check if its value is equal to the respective string
            if(map.containsKey(pattern.charAt(i))){
                //if its not matching return false
                 if(!map.get(c).equals(str[i])){
                     return false;
                 }
            }
            //otherwise, check if the set already contains string before adding it to hash map if so return false
               else if(set.contains(str[i])){
                       return false;
                   }
               //otherwise, add the key and value to hash map and value to set
               else{
                   map.put(pattern.charAt(i),str[i]);
                   set.add(str[i]);
               }
               
        }
    
        return true;
    }
}