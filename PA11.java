class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       
        List<List<String>> res= new ArrayList<List<String>>();
         if(strs==null || strs.length==0){
            return res;
        }
        HashMap<String, List<String>> hm= new HashMap<String, List<String>>();
        

        for(String s: strs){
            
            char[] arr = s.toCharArray();
            
            Arrays.sort(arr);
            
            String st= new String(arr);
            
            if(hm.containsKey(st)){
                List l = hm.get(st);
                l.add(s);
                hm.put(st,l);
            }
            else{
                List l = new ArrayList<String>();
                l.add(s);
                hm.put(st,l);
            }
            
            
        }
        
        for(Map.Entry ent : hm.entrySet()){
            res.add((List<String>)ent.getValue());
        }
        
        return  res;
    }
}