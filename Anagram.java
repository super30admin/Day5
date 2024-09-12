//Amazon interview
//Time complexity = O(nklogk)
//Space complexity = O(n)
//Example of anagrams are : ate,eat,tea the same letters with same character count in any order is called anagram.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //anagrams means can be two words that can be simply look like to each other
        //same count of count of each character in those words
        //method 1 can be implemented using hashmap and sorting
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        //Created a hashmap for string and list for strings
        HashMap<String, List<String>> map = new HashMap<>();
        
        //checking the length of string and incrementing to words
        for(int i=0; i<strs.length;i++){
            //replacing the strs with index value in str string
            String str = strs[i];
            //Converting string to character and storing in charArray
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            //checking the sorted string for how many values if it same character with same letters in any order 
            String sorted = String.valueOf(charArray);
            //If it containsKey in sorted then putting the sorted values in new ArrayList and if not maps then getting the sorted order and adding the str to it.
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
       //Return the hash map contains values
        return new ArrayList<>(map.values());
        
        
    }
}