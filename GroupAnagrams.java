class Solution {
    private int[] hashcodes=new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
    
    private double getHashCode(String str)
    {
        double code=1;
        
        for(int i=0;i<str.length();i++)
        {
            code*=hashcodes[str.charAt(i)-'a'];
        }
        
        return code;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Double,List<String>> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            double prime_product=getHashCode(strs[i]);
            if(!map.containsKey(prime_product))
                map.put(prime_product,new ArrayList<>());
            map.get(prime_product).add(strs[i]);                
        }
        
        return new ArrayList<>(map.values());
        
        
    }
    
    
}
// n is length of array, m is length of string
// Time Complexity : O(m*n)
// Space Complexity : O(m*n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
