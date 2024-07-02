//TC: O(N∗Klogk)
//SC: O(N∗K)

class Solution {
    public List<List<String>> groupAnagrams (String[] strs) {
        HashMap <String, List<String>> map = new HashMap<>();
        for(String s: strs){
            //sort this s
            char [] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String. valueOf (charArr);
            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get (sortedStr) .add(s) ;
        }
        return new ArrayList<>(map.values());
    }
}