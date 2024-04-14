import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Time Complexity :In general the space Complexity will be o(nL)  where n is no of strings and L is length of string
// Space Complexity:since alphabets are only 26(constant) it is O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
//No 

// Your code here along with comments explaining your approach
/*So first converted to character Array and the sorted it so that we can make it as a key whenever same alphabets are there in the string we can recongnize the key and the list of anagrams since anagrams are nothing but the possible ways to writed a word when we change the position */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return null;
        HashMap<String,List<String>> map=new HashMap<>();
        for(String str:strs){
            char[] sorted=str.toCharArray();
            Arrays.sort(sorted);
            String sortedStr=String.valueOf(sorted);
            if(!map.containsKey(sortedStr)){
                map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(str);

        }
        return new ArrayList<>(map.values());
    }
}