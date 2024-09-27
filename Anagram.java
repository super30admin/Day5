// Time Complexity : O(n*m log m) where n is size of array, m is length of longest string. m log m as we are //sorting the strings
// Space Complexity :O(m*n) We store m characters of n strings in worst case
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Anagram {
     public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Integer> map = new HashMap<String,Integer>();
          List<List<String>> result = new ArrayList<List<String>>();
        
        for(String s : strs)
        {
            char[] c = s.toCharArray();
                Arrays.sort(c);                 //sort string
                String sorted_string = new String(c);
            if(map.containsKey(sorted_string)) //anagram exists in map
            {
                result.get(map.get(sorted_string)).add(s); //if sorted_string was encountered before, result will have an entry,                                                              //insert there
                
            }
            else
            {
                //insert in map : key is sorted string value is index in list
                // result is list of lists
                map.put(sorted_string,map.size());
                List<String> l = new ArrayList<String>();
                l.add(s);
                result.add(l);
            }
        }
        
        return result;
    }        
}