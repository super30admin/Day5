//Time complexity: O(nklogk)
//Space complexity: O(n+2k+2)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){ //n
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr); //logk
            String sorted = String.valueOf(arr);
            if(!map.containsKey(sorted)){ // 1
                map.put(sorted,new ArrayList<>()); //1
            }
            map.get(sorted).add(strs[i]); // 1
        }
        return new ArrayList<>(map.values()); //k
    }
}
