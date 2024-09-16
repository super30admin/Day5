// Time Complexity : O(n k log k) where n is number of words and k is average length of each word
// Space Complexity :O(nk)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

public class GroupAnagrams {
        public List<List<String>> groupAnagrams(String[] strs) {

            HashMap<String, List<String>> map  = new HashMap<>();

            for(String s: strs){
                char[] charArr = s.toCharArray(); // convert to char array

                Arrays.sort(charArr); //sort the character array which will be our key

                String sorted = String.valueOf(charArr); // convert to string

                if(!map.containsKey(sorted)){
                    map.put(sorted,new ArrayList<>());
                }
                map.get(sorted).add(s);
            }
            return new ArrayList<>(map.values());
        }
    }
