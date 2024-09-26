//49. Group Anagrams
//Time complexity: T(nklog(k)) ; Let 'k' be the avg length of a string in strs, teh to sort a string, T(k)= k*log(k). Sort is performed on each of the n string. Total time complexity = n*k*log(k)
//Space Complexity: T(n*k) ;for each arr we need k space. Total n*k

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String sortedStr;
        HashMap<String,ArrayList<String>> map=new HashMap<>();
       
        for(String str: strs)
        {
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
          sortedStr= String.valueOf(arr);
            if(!map.containsKey(sortedStr))
            {
                map.put(sortedStr,new ArrayList<String>());
            }
            map.get(sortedStr).add(str);
            
        }
        
        return new ArrayList<>(map.values());
        
    }
}