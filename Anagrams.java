// Time Complexity : 0(n mlogm) where n is length of strs and m is length of longest string
// Space Complexity : 0(k) for hashmap where k are unique number of sequences
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        //map of sorted string, list of strings
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        //iterate through the list of strings - time complexity n
        for(String s : strs){
            //sort string to check if same sequence is present in map
            char[] c = s.toCharArray();
            Arrays.sort(c); //mlogm time complexity
            String tmp = new String(c);

            //if sequence not present then initialize new list
            if(!map.containsKey(tmp)){
                map.put(tmp,new ArrayList<>());
            }
            //add string to the list of a sequence
            map.get(tmp).add(s);
        }

        //iterate through the map & add all the lists in result list
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }

        return result;
    }
}