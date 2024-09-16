/*Time Complexity : O(n(klog k)). n is the length of the string array. On average each word in the array is of length k
 and to sort each of it requires O(klog k) time. Hence the total time complexity is O(n(klog k)).
Space Complexity : O(nk).(in terms of characters or O(n) in terms of strings). there are n strings and k sorted strings, thus total info stored in hashmap.
 */
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            //convert each string from string array into char array and at each iteration sort each string alaphabetically after which convert back to string
            char tempArray[] = strs[i].toCharArray();
            Arrays.sort(tempArray);
            String temp = Arrays.toString(tempArray);
            //if map does not contain this sorted string add it as key with empty list as value
            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList < String > ());
            }
         //otherwise just add the string to the list
                map.get(temp).add(strs[i]);   
        }

        return new ArrayList(map.values());
    }
}