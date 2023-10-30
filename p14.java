class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String,List<String>>map=new HashMap<>();

        for(String e:strs)
        {
            char ch[]=e.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if(!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<String>());
            }

            map.get(sorted).add(e);
        }

        return new LinkedList<>(map.values());
    }
}