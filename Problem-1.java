// Time Complexity : O(N) 
// Space Complexity : O(M) , M- number of unique length words in string array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Integer,List<String>> map = new HashMap<>();
        int count=0;
        for(int i=0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            count=0;
            for(int j =0;j<c.length;j++){
                count += (int) c[j] * (int) c[j] *(int) c[j] *(int) c[j] ;
            }
            if(map.containsKey(count))
                map.get(count).add(strs[i]);
            else{
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                 map.put(count,temp);
            }
               
        }
        List<List<String>> ret= new ArrayList<>();
        for(int key: map.keySet()){
            ret.add(map.get(key));
        }
        return ret;
    }
}
