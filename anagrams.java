class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ana=new HashMap<>();
        
        
        
        for(String s:strs)
        {
            char[] c=s.toCharArray();
        
            Arrays.sort(c);
            String sortstr=new String(c);
            if(ana.containsKey(sortstr))
            {
                ana.get(sortstr).add(s);
                
                    
            }else
            {
                List<String> an=new ArrayList<>();
                an.add(s);
                ana.put(sortstr,an);
            }
            
            
        }
        List<List<String>> anagrams=new ArrayList<>();
        for(Map.Entry entry:ana.entrySet())
        {
            anagrams.add((List<String>)entry.getValue());
        }
        return anagrams;
    }
}
