/* 
 * 
 * /* Time Complexity : O(m*klog(k))  // here i used the hashmap 
  Space Complexity : O(n)
 Did this code successfully run on Leetcode : yes
 Any problem you faced while coding this : no
 
 Approach:
 Here I am using:
 1. Take a string a sort it 
 2. Then i am checking that sorted key is present or not in hashmap 
 3. if it is not present add sorted String as a Key and value as a String
 4. if it is present add string in to the hashmap 
 5. retrun final list of values( here values are list of strings);
 
 
 * If we sort each string first and group the same strings, then time complexity would be m*klog(k) where m is the
number of strings and k is the average length of the string.

 But if we use a count array, then the time complexity ( here this approach will  use prime factors )
will be O(m*k) where m is the number of strings and n is the average length of the string as we have to go through each
string to count how many characters it has. We're using only a count array
 */


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String a : strs){
            char[] b = a.toCharArray();
            Arrays.sort(b);
            String sortedA = String.valueOf(b);
            if(!map.containsKey(sortedA)){
                map.put(sortedA,new ArrayList<>());
                map.get(sortedA).add(a);
            }else{
                map.get(sortedA).add(a);
            }   
        }
        return new ArrayList<>(map.values());
        
    }
}
