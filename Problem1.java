
/*
Leetcode Submitted : Yes
Space Complexity : O(N)
Time Complexity : O(N*MlogM) #M= String Size
The idea is to sort string and store in hashmap as key and values as list of string
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String s : strs){
            char[] temp =  s.toCharArray();
            Arrays.sort(temp);
            String new_temp = String.valueOf(temp);
            
            if(hm.containsKey(new_temp)){
                hm.get(new_temp).add(s);
                
            }else{
                List<String> a = new ArrayList<>();
                a.add(s);
                hm.put(new_temp,a);
            }
            
        }
        
        return new ArrayList(hm.values());
        
    }
}

