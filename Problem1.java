import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Time Complexity : O(n) where n is the total number of characters in all strings
// Space Complexity : O(n) where n is total number of strings to store the answer
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<>();
        int[] count = new int[26];
        for(String s: strs){
            Arrays.fill(count, 0);
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            
            StringBuilder sb = new StringBuilder("");
            for(int i=0; i<26; i++){
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if(!ans.containsKey(key)) {
                ans.put(key, new ArrayList());
            }
            ans.get(key).add(s);
        }
        
        return new ArrayList(ans.values());
    }

    public static void main(String[] args) {
        Problem1 obj = new Problem1();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = obj.groupAnagrams(strs);
        for(int i=0; i<result.size(); i++) {
            for(int j=0; j<result.get(i).size(); j++)
                System.out.println(result.get(i).get(j));
        }
    }
}