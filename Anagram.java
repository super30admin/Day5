class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(map.containsKey(s))
                map.get(s).add(strs[i]);
            else{
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(s,list);
            }
        }

        for(String key:map.keySet()){
            ans.add(map.get(key));
        }
        return ans;
    }
}
