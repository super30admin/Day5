//TC: O(n*klogk) k-length of each word  (klogk) for sorting the word, n - number of strings or length of the string array
//Sc: O(n) and char array of length k for each word can be neglected, if all the words are unique then we store each word in the string -- n
//Leetcode successful
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        
        for(String i : strs){
            //sorting the string by creating an character array
            char [] arr = i.toCharArray();
            Arrays.sort(arr);
            String sorted = String.valueOf(arr);  // String.valueOf(array) gives the word forming from the char array
            
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            
                map.get(sorted).add(i);
        }
            
        return new ArrayList<>(map.values());
    }
}
