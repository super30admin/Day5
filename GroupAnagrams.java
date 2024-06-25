//Time Complexity : O(N*L)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
class GroupAnagrams {
    int[] primeNumbers;
    public List<List<String>> groupAnagrams(String[] strs) {
        this.primeNumbers = new int[]{2,3,5,7,11,13,17,19,23,27,29,31,37,41,43,47,53,59,61,
                67,71,73,79,83,89,97,101,103};
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String str : strs) {
            double primeProduct = getPrimeProduct(str);
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(str);

        }
        return new ArrayList<>(map.values());
    }

    private double getPrimeProduct(String s) {
        double result = 1;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            result = result * primeNumbers[c - 'a'];
        }
        return result;
    }
}