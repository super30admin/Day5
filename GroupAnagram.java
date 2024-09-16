// Time Complexity : O(nk)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Using prime product as key
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<Double, List<String>> map = new HashMap<>();        
        for(String str : strs)
        {
            double key = getPrimeProductOfCharacters(str);
            
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
    
            }
            map.get(key).add(str);
                
        }
        
        return new ArrayList<>(map.values());
    }
    
    // Prime numbers are product of itself so they will be unique product for each alphabets multiplication
    private double getPrimeProductOfCharacters(String str)
    {
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        
        double res = 1;
        
        for(char c : str.toCharArray())
        {
            res = res * primes[c-'a'];
        }
        
        return res;
    }
}

// Using sorted str as key TC: O(nklogk) + O(k)  -> O(nklogk) SC: O(1)
public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();        
        for(int i = 0 ; i < strs.length; i++)
        {
            char [] strArray= strs[i].toCharArray();
            Arrays.sort(strArray);
            String key = String.valueOf(strArray);
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>());
    
            }
            map.get(key).add(strs[i]);
                
        }
        
        return new ArrayList<>(map.values());
    }
}
