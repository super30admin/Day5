/*
 *  Time Complexity: O(nk) where n is the number of strings and k is the length of the string.
 *  Space Complexity: O(N) where number of the strings in the array, since max length of each string is 100 we can consider it to be constant.
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : None
 *
 *  Initialize a map with type of key as long and value as list of strings. Now compute the hash of each strin. We can do so be taking all prime numbers for the range of characters in an array. The index of the array can be computed by substracting the any character with min element of the character range. Now multiply all the values for the characters in a string to get a unique long which is the hash and would be the same for all the strings that have the same characters. Check this condition for the hash and add all the string with same hash to the values list. Return the list of values.
 */
class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Long, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String s: strs){
            long hash = getHash(s);
            if(map.containsKey(hash)){
                List<String> lst = map.get(hash);
                lst.add(s);
                map.put(hash, lst);
            }
            else{
                List<String> lst = new ArrayList<>();
                lst.add(s);
                map.put(hash, lst);
            } 
        }
        return new ArrayList<>(map.values());
    }
    
    public long getHash(String str){
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        long hash=1;
        for(char c : str.toCharArray()){
            hash = primes[c-'a']*hash;
        }
        return hash;
    }
    
}
