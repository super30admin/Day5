// Time Complexity : O(n * k) where n is the length of strings array and k is average length of a word
// Space Complexity : O(n) where n is the length of the strings array
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// We calculate the hash for every string and each collision, we group the words in a list
// Finally we return all the list in a list.

class Solution {
    int[] primes = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Double, List<String>> resMap = new HashMap<>();
        
        for (String str: strs) {
            double hash = calculateHash(str);
            
            if (resMap.containsKey(hash)) {
                List<String> curr = resMap.get(hash);
                curr.add(str);
                resMap.put(hash, curr);
            } else {
                List<String> words = new ArrayList<>();
                words.add(str);
                resMap.put(hash, words);
            }
        }
        
        return new ArrayList<>(resMap.values());
     }
    
    private double calculateHash(String word) {
        double res = 1;
        
        for (int i=0; i<word.length(); i++) {
            int ch = word.charAt(i);
            
            int chMultFactor = primes[ch - 'a'];
            
            res *= chMultFactor;
        }
        
        return res;
    }
}
