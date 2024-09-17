/**Leetcode question: 205
 * Isomorphic strings
 */
/** Algorithm
 * Check if the length of both the strings is same, if nt return false;
 * Create a hashmap and a hashset to store the key-value pair and the unique characters in the hashset
 * If the hashmap contains the character in string s and is not mapped to the character in string t, return false
 * else check if the hash set contains the character in String t - this means that the tChar is already mapped to something else so return false
 * else add both the sChar and tChar to the hashMap and HashSet
 */

/**TC - O(N) - N is the number of characters in the string 
 * SC - O(1) - It is constant because it can contain only ASCII values excluding null
*/

public class IsomorphicStrings {
    class Solution {
        public boolean isIsomorphic(String s, String t) {
            if(s.length() != t.length()){
                return false;
            }
            HashMap<Character,Character> sMap = new HashMap<>(); // to store the key value pair
            HashSet<Character> tSet = new HashSet<>();  // to store the caharcters that have already been mapped
            for(int i =0; i<s.length();i++){
                char sChar = s.charAt(i);
                char tChar = t.charAt(i);
                if(sMap.containsKey(sChar)){     //check if the key is alreday present
                    if(sMap.get(sChar)!= tChar){  //key present but the value is not the same for mapping
                        return false;
                    }
                }
                else if(tSet.contains(tChar)){   //check if the character has alreday been mapped to something else
                    return false;
                }
                else{                          //put both in the HashSet and HashMap
                    sMap.put(sChar, tChar);
                    tSet.add(tChar);
                }
            }
            return true;
        }
    }
    
}
