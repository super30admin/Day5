// Time Complexity : O(nk) => Assuming k is the length of each word in the string and we are travesing through the each word of length k and there are total n words so TC will be O(nk)
// Space Complexity : O(1) => Constant space compleexity as we are not utizlizing additional space. If we only consider lowercase then max size will be 26.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
Approach: In the above solution, sorting is an expensive operation(TC=> O(klogk)). To avoid this, we can use mathematical rule that multiplying prime numbers will give unique value.
This product will be the key and value will be the List<String> having same value as the key.
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }

        HashMap<Double, List<String>> anagramMap = new HashMap<>(); //Key will be the product of prime numbers, value will be list of original strings

        for(int i =0; i < strs.length; i++){
            String str = strs[i];
            double finalResult = primeProduct(str);
            //Check if key is present, if not add the key and initialize the value as empty list
            if(!anagramMap.containsKey(finalResult)){
                anagramMap.put(finalResult, new ArrayList<>());
            }
            anagramMap.get(finalResult).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }

    //It will rerurn double to avoid integer overflow
    //In this method map every character will be mapped to corresponding prime numbers
    private double primeProduct(String s){
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double result = 1;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            result = result * primeNumbers[c - 'a'];
        }
        return result;
    }
}