// Time Complexity :O(nk)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// 49. Group Anagrams
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<Double, List<String>> map = new HashMap<>();
        for (int i=0; i<strs.length; i++){
            String str = strs[i];
            double pp = primeProduct(str);
            if(!map.containsKey(pp)){
                map.put(pp, new ArrayList<>());
            }
            map.get(pp).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
    private double primeProduct(String s){
        double k = 1;
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101, 103};
        for (int j=0; j<s.length(); j++){
            char a = s.charAt(j);
            k = k*prime[a - 'a'];
        }
        return k;
    }
}