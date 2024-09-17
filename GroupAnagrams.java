// Time Complexity : O(nklogk) n is length of the input, k is the max length of any word
// Space Complexity : O(n) - space for map
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;

        //map to store sorted word against a list of its anagrams
        HashMap<String, ArrayList<String>> hm = new HashMap<>();

        for(int i=0; i<n; i++) {

            //convert the string into char array, sort and convert back to string
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);

            //map already contains this key, add the incoming word to it's list
            if(hm.containsKey(s))
                hm.get(s).add(strs[i]);
            else
            {
                //put the sorted word and it's list of anagrams in the map
                ArrayList<String> words = new ArrayList<>();
                words.add(strs[i]);
                hm.put(s, words);
            }
        }

        List<List<String>> result = new ArrayList<>();

        //convert map to list of lists
        hm.forEach((k,v) -> result.add(v));

        return result;

    }
}
