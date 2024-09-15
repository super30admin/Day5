//Time Complexity: O(n)+ O(klogk)
//Space Complexity: O(n).
//Does this code run on Leetcode: Yes.
//Any problems faced during execution: No. 


//Checking for anagrams can be done by using the prime number method or by using the sorting technique, prime number multiplication can be used to calculate the numerical value and reduce the time complexity further to O(nk).


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null)
            return new ArrayList<>();
        HashMap<String , List<String>> anagramsPattern = new HashMap<>();
        
        
        for (int i = 0; i < strs.length; i++)
        {
            char charArray[] = strs[i].toCharArray();
            Arrays.sort(charArray);
            String temp = new String(charArray);
            
            if(!anagramsPattern.containsKey(temp)){
                anagramsPattern.put(temp, new ArrayList<String>()); 
            }
            anagramsPattern.get(temp).add(strs[i]);     
        } 
       return new ArrayList<>(anagramsPattern.values());
    }
}