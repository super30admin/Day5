// Time Complexity : n x nlogn = n^2 logn . n for traversal and nlogn for sorting each word
// Space Complexity : o(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : none


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(String s : strs){

            String keyword = helper(s);

            if(!map.containsKey(keyword)){

                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(keyword,list);
            }
            else{

                List<String> existinglist = map.get(keyword);
                existinglist.add(s);
            }
        }

        for(String sets : map.keySet()){

            ans.add(map.get(sets));
        }

        return ans;

    }

    private String helper(String inputString){

        char tempArray[] = inputString.toCharArray();

        Arrays.sort(tempArray);

        return new String(tempArray);
    }
}
