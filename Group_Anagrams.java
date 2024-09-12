//Runtime: O(nk)
//Space: O(nk)
//Passed on leetcode
//conceptually difficult at first but coding was good once concept was understood
public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap <Long, List<String>> anagram_groups = new HashMap<>();
        for(String s : strs){
            long primeP = makePrimeProduct(s);
            if(anagram_groups.containsKey(primeP) == false){
                anagram_groups.put(primeP, new ArrayList<>());
            }

            anagram_groups.get(primeP).add(s);
        }
        return new ArrayList<>(anagram_groups.values());
    }
    public Long makePrimeProduct(String s){
        long retVal = 1;
        int [] primes =  {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            retVal = retVal * primes[a - 'a'];
        }
        return retVal;
    }
}