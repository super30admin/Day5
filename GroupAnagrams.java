/*
Time Complexity: O(NK), where N is the length of strs,
K is the maximum length of a string in strs

Space Complexity: O(NK), the total information content .

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
 */


// Your code here along with comments explaining your approach
/*
generate a map with key as the character of the word in increasing order of their character
and value will be the anagrams of it ( words with the same characters)
the final map will give you the groups of anagrams
 */

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null) return new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        int[] count=new int[26];
        for(String str:strs){
            Arrays.fill(count,0);
            for(char c:str.toCharArray()) {
                count[c-'a']++;
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append(count[i]);
                sb.append("#");
            }
            String keyStr=sb.toString();
            if(!map.containsKey(keyStr))
                map.put(keyStr,new ArrayList<>());
            map.get(keyStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
