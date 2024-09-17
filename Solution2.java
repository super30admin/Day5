// Time Complexity O(nk), where n = number of Strings, and k = length of each string
// Space complexity O(nk)

class Solution2 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        HashMap<Long, List<String>> map = new HashMap<>();
        for(String str : strs){
            long product = primeProduct(str);
            if(!map.containsKey(product)){
                map.put(product, new ArrayList<>());
            }
            map.get(product).add(str);
        }
        return new ArrayList<>(map.values());
    }
    private long primeProduct(String s){
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109};
        long result = 1;
        for(int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            result = result * primes[c - 'a'];
        }
        return result;
    }
}