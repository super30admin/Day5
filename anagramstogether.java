// Time Complexity : O(nk)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Double,List<String>> smap = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            double product=primeproduct(strs[i]);
            if(!smap.containsKey(product)){
                smap.put(product,new ArrayList<>());
            }
            smap.get(product).add(strs[i]);
        }
        
        return new ArrayList<>(smap.values());
    }
    
    private double primeproduct(String str){
        int [] primenumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double product =1;
        for(int i=0;i<str.length();i++){
            char chr = str.charAt(i);
            product = product * primenumbers[chr-'a'];
        }
        return product;
    }
}
    
MY APPROACH:

Here we can use two method sort each string first add first come sorted key then add unsorted string to value and keep adding till key matches repeat process and return map.values() it will be List<List<Strings>>




