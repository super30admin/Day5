/*Time Complexity  :O(N)
Space Complexity: O(1) as there will be only characters which are limited in number.
Though the length is n, the hash map or hash set will store unique characters. Hence it is O(1)
*/
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() == 0) {
            return true;
        }
        int count=0;
        //maintain seperate hash maps for strings 's' and 't'
        Map<Character,Integer> hash_s = new HashMap<>();
        Map<Character,Integer> hash_t = new HashMap<>();
        //add the characters to respectives hasmaps from their strings
        for(int i=0;i<s.length();i++){
            if(!hash_s.containsKey(s.charAt(i))){
                hash_s.put(s.charAt(i),i);
            }
            if(!hash_t.containsKey(t.charAt(i))){
                hash_t.put(t.charAt(i),i);
            }
        }
        
         for(int i=0;i<s.length();i++){
             //if both the maps contain the same character at the same index then increement the count
             if(hash_s.get(s.charAt(i))==hash_t.get(t.charAt(i)))
                 count++;
         }
//if the total count is equal to length of any string then the given strings are isomorphic
         if(count == s.length())
         {
             return true;
         }
         else{
             return false;
         }        
    }
}