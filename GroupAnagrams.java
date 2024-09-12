class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String word : strs){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            String sw = new String(arr);
            map.computeIfAbsent(sw,k->new ArrayList<String>()).add(word);
        }
        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String,List<String>> obj : map.entrySet()){
            ans.add(obj.getValue());
        }
        return ans;
    }
}