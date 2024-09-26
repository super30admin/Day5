// Time Complexity : O(n*k)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english
// use the primeProduct to get the same key for the given string, and use it to store it to the hashmap, at the end return the result of the list.
// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // HashMap <String, List<String>> hm = new HashMap <>();
        HashMap <Double, List<String>> hm = new HashMap <>();
        for(String st: strs){
            double result = primeProduct(st);
            if(!hm.containsKey(result)){
                hm.put(result, new ArrayList <>());
            }
            hm.get(result).add(st);
        }
        return new ArrayList<>(hm.values());
    }

    private double primeProduct(String st){
        double result = 1;
        int [] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for( int i = 0; i < st.length(); i++){
            char ch = st.charAt(i);
            result = result * primes[ch - 'a'];
        }
        return result;
    }
}