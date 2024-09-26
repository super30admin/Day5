//Time complexity=O(NK log K)
//Space Complexity=O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : N0 

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hp=new HashMap<>();
        //We are traversing through the entire arrays of string and are sorting each string by converting them to char arrays and using Arrays.sort() to sort them and comparing them with the key that is our sorted array each time and are stroing the value in it.
        for(String str : strs)  
        {
            char[] curr=str.toCharArray();
            Arrays.sort(curr);
            if(!hp.containsKey(String.valueOf(curr)))
                hp.put(String.valueOf(curr),new ArrayList<String>());
            hp.get(String.valueOf(curr)).add(str);
        }
        return new ArrayList<List<String>>(hp.values());
    }
}