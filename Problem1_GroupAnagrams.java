
//Time Complexity : o(nlogn)
//Space Complexity : o(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


//Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
         Map<String, List<String>> map = new HashMap();
        
        for(String s:strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            
            String temp=new String(ch);
            
            if(!map.containsKey(temp))
            {
                map.put(temp,new ArrayList<>());
                map.get(temp).add(s);
            }
            else
            {
                map.get(temp).add(s);
            }   
        }
        
        List<List<String>> result=new ArrayList<>();
        
        for(String i:map.keySet())
        {
            result.add(map.get(i));
        }
        
        return result;
    }
}