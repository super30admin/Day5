// Time Complexity :O(n*mlogm)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
         //create a hashmap
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {   //making an array of characters in the string
            char[] c=strs[i].toCharArray();
            //sorting the new array
            Arrays.sort(c);
            //convering array of characters in string and storing the string in sortedString
            String sortedString=String.valueOf(c);
            //if our hashMap doesn't contains that string before
            if(!map.containsKey(sortedString))
            {   //put the string as key and make a new Array corresponding to the present key 
                map.put(sortedString,new ArrayList<>());
            }
            //add the element to the list(value)
              map.get(sortedString).add(strs[i]); 
            //return all the values of map by making a new list
           
        }
         return new ArrayList<>(map.values());
    }
}