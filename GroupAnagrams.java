// Time Complexity : O(nk)) 
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Approach:
// 1. I used HashMap to store the anagrams togethe against the same key. 
// 2. To get the same key for anagrams, I used prime numbers multiplication, assigned a different prime number to every character from a to z and then key 
// for every string was calcualted by multiplying the corresponding prime number for every appearing character.
// 3. As the multiplication product remains the same irrespective of the order of multiplicants, (a*b*c == a*c*b), all the anagrams were grouped together easily.

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<Integer, List<String>> map = new HashMap<>();
        for(String s : strs){
            int key = calculateKey(s);
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<String>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    public int calculateKey(String s){
        int[] primes = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        int multi = 1;
        
        for(char c: s.toCharArray()){
            multi *= primes[c - 'a'];
        }
        return multi;
    }
}
