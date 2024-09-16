// Time Complexity :O(n) where n is average length of strs
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : None

class Solution {
    
    private double primecode(String s)
    {
        double result = 1;
       int prime[]={ 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        char[] chars= s.toCharArray();
        for(int i=0; i<= chars.length-1; i++){
            result *= prime[chars[i]-'a'];
        }
        return result;
    }
    
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> mymap= new HashMap<>();
        for(String s: strs){
            double code= primecode(s);
            if(!mymap.containsKey(code)){
                mymap.put(code,new ArrayList<>());
            }
                mymap.get(code).add(s);
        }
        return new ArrayList<>(mymap.values());
    }
}