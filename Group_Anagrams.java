// Time Complexity : O(NKlogK)
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<Double, List<String>> map = new HashMap<>();

        for(String str : strs){
            double hash = getHash(str);

            if(!map.containsKey(hash))
            {
                map.put(hash, new ArrayList<>());
            }

            map.get(hash).add(str);
        }

        List<List<String>> out = new ArrayList<>();
        for(List<String> value : map.values()){
            out.add(value);
        }

        return out;
    }

    private static int[] primes =  new int[]{
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
        31, 37, 41, 43, 47, 53, 59, 61, 67,
        71, 73, 79, 83, 89, 97, 101
    };

    private double getHash(String s)
    {
        double hash = 1;

        for(int i = 0; i < s.length(); ++i){
            int ch = s.charAt(i);

            hash = hash * primes[ch - 'a'];
        }
        return hash;
    }

}