// Time Complexity : O(n*k(logk)) n:Array of strings length, k:max length of string - klog(k) to sort the strings and n to traverse through the array of strings
// Space Complexity : O(n*k)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Approach: Created a map where 'keys' are sorted strings and 'values' are list of the strings with same sorted string. 
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>(); 
        for(int i=0;i<strs.length;i++){
            char[] charArr = strs[i].toCharArray(); //converting the string to character array
            Arrays.sort(charArr);                    //Sorting the character array and converting it into string again.
            String s = String.valueOf(charArr);
            if(!map.containsKey(s)){                //if there is no key of that sorted string will be creating new list 
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);               //Adding the actual strings to the created lists.
        }
        return new ArrayList<>(map.values());
    }
}
