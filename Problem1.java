//Group Anagrams

// Time Complexity : o(nklogk) where n is the number of words in the array and k is the number of characters in a string. O(n) - parsing each word in the strin
// o(k log k) - sorting algorithm
// Space Complexity : O(nk) where n - number of words in the string and k - number of characters in each string
// Did this code successfully run on Leetcode :  Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case
        if(strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<String,List<String>> hm = new HashMap<>();

        for(String str : strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            if(!hm.containsKey(sorted)){
                hm.put(sorted,new ArrayList<String>());
            }
            hm.get(sorted).add(str);
        }

        return new ArrayList<>(hm.values());

    }
}





// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case
        if(strs==null || strs.length == 0)
            return new ArrayList<>();

        HashMap<Long,List<String>> hm = new HashMap<>();

        for(String str : strs){
            // char[] c = str.toCharArray();
            // Arrays.sort(c);
            // String sorted = String.valueOf(c);
            long primeProduct = primeProduct(str);
            if(!hm.containsKey(primeProduct)){
                hm.put(primeProduct,new ArrayList<String>());
            }
            hm.get(primeProduct).add(str);
        }

        return new ArrayList<>(hm.values());

    }

    private long primeProduct(String str){

        //Each character corresponds to a prime number. And the product of such primes are unique
        int[] primes ={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        long primeProduct = 1;
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            primeProduct = primeProduct * primes[c-'a'];
        }
        return primeProduct;
    }
}

