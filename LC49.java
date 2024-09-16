// Time Complexity : O(NK)
// Space Complexity : O(NK)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//For every string in the list of strings, we find a unique number by multiplying every character of that string where every character is represented by a unique prime number.
//Now we have unique values so we dont need to sort. We can just map strings to their unique values and keep adding the strings to the arraylist.
//Finally just return the hashmap values stored in the arraylist.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        
        HashMap<Long, List<String>> map = new HashMap<>();
        
        for(int x = 0; x < strs.length; x++){
            long key = generatePrime(strs[x]);
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(strs[x]);
        }
        
        return new ArrayList<>(map.values());
        
        
        
    }
    
    private long generatePrime(String str){
            int[] Prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
            long multiplication = 1;
            for(int i = 0; i < str.length(); i++){
                char ch = str.charAt(i);
                
                multiplication = multiplication * Prime[ch - 'a'];
            }
            return multiplication;
        }
}