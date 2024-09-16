class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0){
            return result;
        }
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] ar = s.toCharArray();
            Arrays.sort(ar);
            String st = String.valueOf(ar);
            if(!map.containsKey(st)){
                map.put(st, new ArrayList<>());
            }
            map.get(st).add(s);
        }
        return new ArrayList<>(map.values());
    }
}

// Time Complexity : O(n * klogk)
// Space Complexity : O(n * k)