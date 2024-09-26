//Time Complexity: O(NK), where N is the length of strs, 
//                        K is the maximum length of a string. Counting each string is linear in the size of the string, and we count every string.
//Space Complexity: O(NK)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


class GroupAnagrams {
    int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    Map<Double, List> hm = new HashMap<Double, List>();
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0)
        {
            return new ArrayList();
        }
        for (String s : strs) {
            Double key = getFormFactor(s);
            if (!hm.containsKey(key)){
                hm.put(key, new ArrayList());
            }
            hm.get(key).add(s);
        }
        return new ArrayList(hm.values());
    }
    private double getFormFactor(String s){
        double factor = 1;
        for(char c : s.toCharArray()){
            factor *= primes[c-'a'];
        }
        return factor;
    }
}