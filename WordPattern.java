/*
-Time Complexity : O(n) length of any string
-Auxiliary Space : O(1)  we are using constant space, in the worst case we will be storing only 26 chars which is nothing if our string is very large.
-Did this code successfully run on Leetcode :Yes
-Any problem you faced while coding this : No
-Your code here along with comments explaining your approach
    1. I am using hashmap to map each character in the pattern to the String in str.
    2. I am also using hashset to store the String which we have already mapped with character in the 1st string.
    3. For every character in pattern I will check if this character is already mapped,
        1. if yes, then I will verify if the its mapping with string in str string is same as current mapping. if not then, return false from there.
        2. if mapping not found then, I will check if string in str is already mapped ( by checking if it is  present in the hashset) if is already mapped , that means that this string is already mapped to some other character in         string s, so return false from there.
        3. else add entry in the map as well as string in str in the hashset.
        
*/
class Solution {
    public boolean wordPattern(String pattern, String str) {
        //edge case
        String []sArray= str.split(" ");
        if(pattern.length() !=  sArray.length)
           return false;
        
       Map<Character, String> map= new HashMap<>();
       Set<String>set = new HashSet<>();
        
       for(int i=0; i< pattern.length(); i++){
           //we dint found mapping for current char in the map.
           //add the mapping in the map as well as add the string in set.
           if(!map.containsKey(pattern.charAt(i))){
               if(set.contains(sArray[i]))
                   return false;
               set.add(sArray[i]);
               map.put(pattern.charAt(i), sArray[i]);
           }
           else{
                if(!map.get(pattern.charAt(i)).equals(sArray[i]))
                   return false;
           }   
       }
       return true;
    }
}
