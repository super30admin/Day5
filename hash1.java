/* Time complexity: O(nk) where k is the length of word and n is the number of words in the list
Space somplexity: O(n)
1. To get unique values for each key or each word, (as we are using hashmap),we allot a prime nubver to eacg alphabet and multiply the prime number corresponding to the letters in the word as and when they occur.
2. create before-hand a list/array of prime numbers for the 26 alphabets (firts 26 prime numbers)
3. since the key will be same only for the jumbled versions of each word, hashmap works perfect here.
*/

class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        if(strs == null || strs.length == 0){
            return new ArrayList<> ();
        }

        HashMap<Long, List<String>> map = new HashMap<> ();
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 103};

        for(String s: strs){
            long p = calculatedP(s, primes);
            if(!map.containsKey(p)){
                map.put(p, new ArrayList<> ());
            }
            map.get(p).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private long calculatedP(String s, int[] primes){
        long mult = 1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            mult = mult*(primes[c - 'a']);
        }
        return mult;
    }
}