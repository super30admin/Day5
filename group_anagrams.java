// TC- O(n)
// SC- O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String> > hash1 = new HashMap <>(); 
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted= String.valueOf(ch);
            if(!hash1.containsKey(sorted)){
                hash1.put(sorted, new ArrayList<>());
            }
            hash1.get(sorted).add(s);
        }
        return new ArrayList<>(hash1.values());
    }
}
