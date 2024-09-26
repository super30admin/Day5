// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : edge case for long ascii value

class groupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        HashMap<Long, List<String>> map = new HashMap<>();
        
        for(String str : strs){
           long strAscii = 1;
           for(int i = 0; i < str.length(); i++) {
                int c = str.charAt(i) - 'a';
                strAscii *= prime[c];
            }
            if(!map.containsKey(strAscii)){
                map.put(strAscii, new ArrayList<>());
            }
            map.get(strAscii).add(str);
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}