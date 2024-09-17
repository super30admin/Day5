class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for(int i = 0; i < strs.length; i++){
            char[] CurrStr = strs[i].toCharArray();
            Arrays.sort(CurrStr);
            String str = String.valueOf(CurrStr);
            if(!map.containsKey(str)){
                map.put(str, new ArrayList<>());
            }
            map.get(str).add(strs[i]);
        }
        List<List<String>> res= new ArrayList<>(map.values());
        return res;
    }
}