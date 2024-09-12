//Time complexity = O(nk) n is the length of given array, k is the length of each word.
//Space Complexity = O(nk)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //checking if the array is empty
        List<List> grouped = new ArrayList<List>();
        if(strs == null || strs.length==0)
            return new ArrayList<>();
        
        //define an array of prime for each characters
        HashMap <Long,List<String>> map= new HashMap<Long,List<String>>();
       for(int index = 0; index < strs.length;index++){
           String current = strs[index];
           long key = createKey(current);
           
           if(!map.containsKey(key)){
               List t = new ArrayList<String>();
               t.add(current);
               map.put(key,t);
           }else{
               (map.get(key)).add(current);
           }
       }
       
      return new ArrayList<>(map.values());      
    }
    
    private long createKey(String s){
        int prime[] ={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        long prod = 1;
        for(int c =0; c<s.length();c++){
             prod  = prod * (int)s.charAt(c) * prime[s.charAt(c)-'a'];
        }
        return prod;
    }
}
