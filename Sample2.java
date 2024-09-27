//Problem-1
// Time Complexity : O(nk) as n strings of length k are traversed to find the prime product
// Space Complexity : O(nk) as n strings are stored of length k
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0 || strs==null)
            return new ArrayList<>();
       Map<Long, List> map = new HashMap<>();

        for(String s : strs)
        {
          long key = primeProduct(s); // getting primeproduct as key
            if(!map.containsKey(key))
            {
                map.put(key, new ArrayList<>()); // putting integer as key and reducing the time complexity as integer key accessed in O(1)
            }
            map.get(key).add(s);
        }
        return new ArrayList(map.values());
    }
    private long primeProduct (String s) // function to find prime product i.e the product of the string ascii value with the form factor stored in prime array
    {
    int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103}; 
        long result=1;
        for(int i=0; i< s.length(); i++)
        {
            char c = s.charAt(i);
            result *= prime[c-'a'];
        }
        return result;
    }
}

//Problem-2
// Time Complexity : O(n) 
// Space Complexity : O(n+n) = O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None


class Solution {
    public boolean isIsomorphic(String s, String t) {
      HashMap<Character, Character> smap = new HashMap<>(); // hashmap for mapping s to t characters
        HashMap<Character, Character> tmap = new HashMap<>(); // hashmap for mapping t to s characters
        
        if(s.length() != t.length())
            return false;
        
        //eagg and acdd are isomorphic as for a in s string is different than a in t string
        for(int i = 0; i < s.length(); i++) 
        {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            
        if(smap.containsKey(ch1)) // if s contains the value
        {
            if(smap.get(ch1)!= ch2) // the value at the key is not same as incoming value for key
                return false;
        }
            else // not present
                smap.put(ch1,ch2); // put the new value
         
         if(tmap.containsKey(ch2)) // if t contains the value
        {
            if(tmap.get(ch2)!= ch1) // the value at the key is not same as incoming value for key
                return false;
        }
            else
                tmap.put(ch2,ch1); // put the new value
        }
        return true;
    }
}