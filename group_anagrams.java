// Time Complexity : O(nl), where "n" is the length of the input array and "l" is the length of each string
// Space Complexity : O(n), where n is the length of input array
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Just wanted to know, if I consider brute-force solution as I will compare each string
                                             //with all other strings in the array (O(n^2)), AND at every comparision I will first
                                             // sort both the strings (O(l logl) where l is the length of each string), and compare
                                             //if both the string are same (O(l) --> string comparison), save that string against the
                                             //sorted string's (will be hashmap key) value
                                             // In this case, does the Time Complexity become O(n^2 (l logl + l)) = O(n^2*l*logl) ???


// Your code here along with comments explaining your approach
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //if input string is null OR is empty, then return empty list
        if(strs == null || strs.length==0) return new ArrayList<>();
        
        HashMap<Long, List<String>> map = new HashMap<>();
        
        //for each string in th strs array
        for(int i =0; i<strs.length ; i++){
            //calculate the hash (to be used as a key in the hashmap to identify all the anagrams for a given combination of characters)
            long hash = generateHash(strs[i]);
            //if hashMap doesnt contain this particular hash, then add it to the hashmap along with a new arraylist as value to the hash key
            if(!map.containsKey(hash)){
                map.put(hash, new ArrayList<>());
            }
            //add the string in the arraylist for the key of hashmap found using the hash function
            map.get(hash).add(strs[i]);
        }
        //return list of list
        return new ArrayList<>(map.values());
    }
    
    //function used to generate prime hash for each string
    public long generateHash(String str){
        long hash = 1;
        int [] primes = {2, 3, 5, 7, 11, 13 , 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        
        for(int i = 0; i<str.length(); i++){
            //get the prime number for the character starting from 'a' in the primes array
            int prime = primes[str.charAt(i) - 'a'];
            hash *= prime;
        }
        //hash will be the multiplication of all the primes numbers associated with the characters for that string
        return hash;
    }
}