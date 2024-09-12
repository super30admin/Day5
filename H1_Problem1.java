// Time Complexity : O(n . k )  // K is average length of string in sting[]
// Space Complexity : O(n . k )
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/*
Using PrimeProudct we find key for given string like hashing
Storing it as a key in HashMap 

If any string is having same primeProduct,  in Values of that primeProduct - Key , we will add the string into the List of Strings



*/


class Solution2 {
    private double primeProduct(String s){
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        
        double ans = 1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            ans = ans * prime[ch - 'a'];
        }
        
        
        
        return ans;
    } 
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String> > map = new HashMap<>();
        
        for(String p : strs){
            double product = primeProduct(p);
            
            if(! map.containsKey(product)) {                
            map.put(product, new ArrayList<>()); }
            
            map.get(product).add(p);
        }
        
        return new ArrayList<>( map.values() );
        
    }
}

public class H1_Problem1 {
    public static void main(String[] args){
        Solution2 s2 = new Solution2();

        String[] str = {"eat","tea","tan","ate","nat","bat"};

        List<String> ans = s2.groupAnagrams(str);
        System.out.println(ans);
    }
}
