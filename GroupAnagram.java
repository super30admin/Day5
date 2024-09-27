// Time Complexity :O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

public class GroupAnagram {

        public List<List<String>> groupAnagram(String[] str) {
            //Initialized a map which takes keys as String and values as List
            Map<String, List<String>> map = new HashMap<>();
            
            // for a single character in the string
            for (String s : str) {
                char[] charArr = s.toCharArray();
                Arrays.sort(charArr);


                String key = String.valueOf(charArr);
                if(!map.containsKey(key)) {
                    map.put(key, new ArrayList<>());
                }
                else{
                map.get(key).add(s);
                }
            } 
            return new ArrayList<>(map.values());
        }
}