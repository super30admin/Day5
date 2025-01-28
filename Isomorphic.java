/*Time complexity: O(n) since we are iterating over the characters of the given string
 * Space complexity : O(n) storing the s->t mappings in hashmap and t characters in hashSet
 * Leetcode : yes
 * Any Problems : No
 */
import java.util.HashMap;
import java.util.HashSet;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //maps stores the mapping from s to t characters to make sure the mappings are consistent. 
        HashMap<Character, Character> maps = new HashMap<Character, Character>();
        ///HashMap<Character, Character> mapt = new HashMap<Character, Character>();
        //Hashset is used to store the t string characters to make sure the characters are already assigned to a different character in S.
        //single Hashmap can also be used but checking if value is already assigneed takes O(n) since values are not hashed, only keys are hashed.
        //another hashmap can also be used but takes more space than the hashset.
        HashSet<Character> mapt = new HashSet<>();
        int curr = 0;

        while(curr < s.length())
        {
            char x = s.charAt(curr);
            char y = t.charAt(curr);
            if(maps.containsKey(x))
            {
                if(maps.get(x) != y)
                    return false;
            }
            else 
            {
                if(mapt.contains(y))
                    return false;
                else
                {
                    maps.put(x,y);
                    mapt.add(y);
                }
            }
            curr++;
        }

        return true;
    }
}