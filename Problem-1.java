// Time Complexity : O(strs.length*s.length)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : While printing map values.


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
        int prime[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101}; 
        for(int i=0;i<strs.length;i++) {
            char[] s = strs[i].toCharArray();
            Double val = 1.0;
            for(int j=0;j<s.length;j++) { 
                int temp = s[j]-97;
                int utemp = prime[temp];
                val*=utemp;
            }
            if(map.containsKey(val)) {
                List<String> ts = map.get(val);
                ts.add(strs[i]);
                map.replace(val,ts);
            }
            else {
                List<String> ls = new ArrayList<>();
                ls.add(strs[i]);
                map.put(val,ls);
            }
        }
        
        return new ArrayList<>(map.values());
    }
}