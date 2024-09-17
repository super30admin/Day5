/* 
 Algorithm:
    1. Traverse through the string array. Sort the string which we will use as key.
    2. If the sorted string key is there in the hashmap then add the string to the arraylist. If not then create an empty arraylist at that place.
    3. Return the arraylist containing map.values;
    
    Time Complexity: o(n)
    Space complexity: O(n)
    
    Did the code execute on leetcode? Yes

*/

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i =0; i<strs.length; i++){
            char[] charArr = strs[i].toCharArray();
            
            Arrays.sort(charArr);
            String s = Arrays.toString(charArr);
            
            if(!map.containsKey(s)){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        
        
        return new ArrayList<>(map.values());
        
    }
}