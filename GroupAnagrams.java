// Time Complexity : O(N klogk)
// Space Complexity : O(nK)
// n is the number of strings and k is the maximum length of the string
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
// Group Anagrams together
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            char [] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            if(map.containsKey(s)) {
                map.get(s).add(str);
            }
            else {
                map.put(s, new ArrayList<>());
                map.get(s).add(str);
            }
        }
        for(String st: map.keySet()) {
            List<String> list = map.get(st);
            result.add(list);
        }
        return result;
    }
}


// Time Complexity : O(nk)
// Space Complexity : O(nK)
// n is the number of strings and k is the maximum length of the string
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No
// Group Anagrams together
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Long, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String str: strs) {
            long val = computeHash(str);
            if(map.containsKey(val)) {
                map.get(val).add(str);
            }
            else {
                map.put(val, new ArrayList<>());
                map.get(val).add(str);
            }
        }
        for(long val: map.keySet()) {
            List<String> res = map.get(val);
            result.add(res);
        }
        return result;
    }
    public long computeHash(String str) {
        int [] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        long result = 1;
        for(int i=0;i<str.length();i++) {
            result = result * primes[str.charAt(i)-'a'];
        }
        return result;
    }
}
