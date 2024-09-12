
/*
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        

        
        mapping = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        hashmap = defaultdict(list)
        
        for s in strs:
            product = 1
            
            for char in s:
                no = ord(char) - ord('a')
                product = product * mapping[no]
            
            
            hashmap[product].append(s)
            
        
        return hashmap.values()

*/

// Time Complexity : O(nk) where n is size of array and k is size of largest string
// Space Complexity : O(1) as alphabets are only 26
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach: I have assigned prime nos to each alphabet as the product of two 
// prime numbers is unique and have used this product as key in hashmap


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        
        HashMap<Long, List<String>> map = new HashMap<>();
        int [] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        for(String s: strs){
            long key = 1;
            
            for (int i=0; i < s.length(); i++){
                key = key * primes[s.charAt(i) - 'a'];
            }
            
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        return new ArrayList<>(map.values());
        
    }
}

