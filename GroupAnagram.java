/*



// Time Complexity : O(n log n) + O(n)
// Space Complexity : O(n), for hashmap
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

Algorithm:
- for each in string array, first sort the string character and check if sorted string is present as key in Hashmap.
- if yes, append the actual string to the values list in Hashmap
- else, create new key,value pair.
- lastly, output all the string in by traversing the Hashmap 


*/
class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length==0){
            return new ArrayList<>();}

            List<List<String>> res = new ArrayList<>();

            HashMap<String, List<String>> map = new HashMap<>();
            for (String word : strs){
                char []arr= word.toCharArray();
                Arrays.sort(arr);
                String key = String.copyValueOf(arr);

                if (map.containsKey(key)){
                    List<String> list = map.get(key);
                    list.add(word);
                    map.put(key,list);
                }else {
                    List<String>list = new ArrayList<>();
                    list.add(word);
                    map.put(key,list);
                }
            }
            for (Map.Entry<String,List<String>> entry : map.entrySet()){
                    List<String>list = entry.getValue();
                    res.add(list);
            }
        return res;
        }

    }
