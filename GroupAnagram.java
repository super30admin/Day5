//Time Complexity : O(n KlogK)
//Space O(1)


import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap <String,List<String>> anagramList=new HashMap<String,List<String>>();
        
        for(int i=0;i<strs.length;i++){
            
            char c[]=strs[i].toCharArray();
            Arrays.sort(c);
            String currStr=new String(c);
            
            if(anagramList.containsKey(currStr)){
                List<String> currList=anagramList.get(currStr);
                System.out.println(currList);
                currList.add(strs[i]);
                anagramList.put(currStr,currList);
            }
            else{
                
                List<String> currList=new ArrayList<String>();
                currList.add(strs[i]);
                anagramList.put(currStr,currList);
                
            }
        }
        
  
        
        System.out.println(anagramList.values());
        
                List<List<String>> ans = new ArrayList<>(anagramList.values());
        return ans;
    }
    
    public PrimeFactor(String s){
        
    }
}
