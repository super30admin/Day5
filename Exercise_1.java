// Time Complexity : O(nklogk) where n is length of strs and k is the size of biggest String in strs.

// Space Complexity :O(n)

// Did this code successfully run on Leetcode :yes 

// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted= new String(charArray);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }map.get(sorted).add(s);
            }
        return new ArrayList(map.values());
        }
    }

