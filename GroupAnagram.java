// Time Complexity : O(nk log k)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class GroupAnagram {

    // Time Complexity : O(nk log k)
    // Space Complexity : O(nk)
    /*public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0) return new ArrayList<>();

        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String sortedStr = String.valueOf(s);

            if(!map.containsKey(sortedStr)){
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }*/

    // Time Complexity : O(nk)
    // Space Complexity : O(nk)
    int[] primeArr = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};

    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length ==0) return new ArrayList<>();

        HashMap<Double,List<String>> map = new HashMap<>();

        for(String str : strs){
            double hash = getHash(str);

            if(!map.containsKey(hash)) {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private double getHash(String str) {
        double hash = 1;
        for(char c : str.toCharArray())  {
            System.out.println(c-'a');
            hash *= primeArr[c - 'a'];
        }

        return hash;
    }
}