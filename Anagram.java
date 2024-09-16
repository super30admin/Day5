// Time Complexity : O(n*k), where is the number of words and k is the average length of the words.
// Space Complexity : O(n*k), where is the number of words and k is the average length of the words. both are same
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         if (strs.length == 0)
//             return new ArrayList();

//         Map<String, List> ans = new HashMap<String, List>();
//         for (String s : strs) {
//             // convert string into char array
//             char[] ca = s.toCharArray();
//             // sort the char array
//             Arrays.sort(ca);
//             // convert char array back into string
//             String key = String.valueOf(ca);

//             if (!ans.containsKey(key)) {
//                 ans.put(key, new ArrayList());
//             }
//             ans.get(key).add(s);
//         }
//         // since we have to return list list we do it like -->
//         return new ArrayList(ans.values());
//     }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<Long, List<String>> map = new HashMap<>();

        for (String s : strs) {

            // calc the prod
            long prod = calcPrime(s);

            // see if the prod is already in the hm, if not then add
            if (!map.containsKey(prod)) {
                map.put(prod, new ArrayList<>());
            }
            map.get(prod).add(s);
        }

        // TC : O(n)
        return new ArrayList<>(map.values());
    }

    private long calcPrime(String s){
        int [] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103}

        long prod = 1;
        // if two have the saem prod that means they have same alphabets
        for (char ch: s.toCharArray()){
            prod = prod*primes[ch-'a'];
        }
        return prod;
    }

}
