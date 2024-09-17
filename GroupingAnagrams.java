//TC : O(n)
//SC : O(n)


class GroupingAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap();
        List<List<String>> res = new ArrayList();
        for(String s : strs)
        {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            if(hm.containsKey(sorted))
            {
                hm.get(sorted).add(s);
            }
            else
            {
                List<String> list = new ArrayList();
                list.add(s);
                res.add(list);
                // list.add(s);
                hm.put(sorted,list);
            }
        }
         return res;
    }
}
