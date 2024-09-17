//Time Complexity :O(nklogk) +O(k)
// Space Complexity :O(nk)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)
            return new ArrayList<>();
        HashMap<String,ArrayList<String>> map= new HashMap<String, ArrayList<String>>();
        
        for (int i=0;i<strs.length;i++){
            //convert string to char array, sort the array and then back to string
            //sorted string will be the key of the hashmap
            char [] charArray= strs[i].toCharArray();
            Arrays.sort(charArray);
            String sorted=String.valueOf(charArray);
            //maps stores all strings togetjer hving same sorted string as key
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<String>());
            }
                map.get(sorted).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
}