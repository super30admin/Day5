/*
Time Complexity - O(nklog(k)) - n is total number of words in the strs array and k is average lebgth of each work used of sorting

Space Complexity - O(nk) - n is total number of words in the strs array and k is average lebgth of each work used of sorting
*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> anagramMap = new HashMap<String,List<String>>();
        for(String s : strs)
        {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String input = String.valueOf(charArray);
            if(!anagramMap.containsKey(input)){
                anagramMap.put(input,new ArrayList<>());
            }
            anagramMap.get(input).add(s);
          
        }
        return new ArrayList<>(anagramMap.values());
    }
}
