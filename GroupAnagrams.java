/*
 Time Complexity - O(nk) where n is number of strings in the array and k is the average length of each string in the array
 Space Complexity - O(n) worst case when none of the strings are anagrams stores all of them in hashmap
 Has it passed all testcases on leetcode - yes
 */

 /*
Using the mathematics principle that product of prime numbers is unique, we declare 26 prime numbers one for each lowercase
English characters. Compute hashKey value based on product of equivalent prime numbers of each character. If hashkey is already present
in the hashmap, then append the string to the list as it is an anagram. At the end return the hashmap values which are list<list<string>>
grouped as anagrams.
*/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return null;
        
        HashMap<Double,List<String>> anagramMap = new HashMap<>();
        for(int i=0; i < strs.length; i++){
            double hashKey = calculateHashKey(strs[i]);
            if(!anagramMap.containsKey(hashKey)){
                anagramMap.put(hashKey, new ArrayList<String>());
            }
            anagramMap.get(hashKey).add(strs[i]);
        }
        return new ArrayList<>(anagramMap.values());
    }
    
    private double calculateHashKey(String s){
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41,43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double hashKey = 1;
        for(int i =0; i<s.length();i++){
            hashKey *= primeNumbers[s.charAt(i) - 'a'];
        }
        return hashKey;
    }
}
