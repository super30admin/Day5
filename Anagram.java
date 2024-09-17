class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>map=new HashMap();    
        List<List<String>> groupAnagrams=new ArrayList();
        for(String string:strs)
        {
            char [] tempchar=string.toCharArray();
            Arrays.sort(tempchar);
            String sorted=new String(tempchar);
            if(!map.containsKey(sorted))
            {
                map.put(sorted,new ArrayList());
            }
            
                map.get(sorted).add(string);    
        }
        groupAnagrams.addAll(map.values());
        return groupAnagrams;        
    }
}

//TimeComplexity- Since we are traversing through all the elements in array which will take O(n) and also sorting each string converting it to chararray mlogm.
//So this will take O(nmlogm)
//Space complexity- O(n) Since we are using hashmap.