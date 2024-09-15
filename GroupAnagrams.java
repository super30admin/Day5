// Time Complexity : O(k log(k))
// Space Complexity : O(k log(k)) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        //null check
        if( strs == null || strs.length == 0) return new ArrayList<>();
        
        //decalring hashMap to store sorted String as key & arr of words as value
        Map<String,List<String>> map = new HashMap<>();
        
        //running loop over the given array of words
        for(String str : strs) {
            char[] sArr = str.toCharArray(); //converting string into array of char
            Arrays.sort(sArr); //sorting it 
            String sorted = String.valueOf(sArr); //storing sorted string
            
            if( ! map.containsKey(sorted) ) { //checking if sorted word is not present
                map.put(sorted, new ArrayList<>()); //if not putting a new entry
            }
            
            List valueArr = new ArrayList<>(); //declaring a new array to store each word made out of that key
            valueArr = map.get(sorted); //getting whatever is store against that key in map
            valueArr.add(str); //adding current word to that entry
            
        }
        
        List<List<String>> result = new ArrayList<>(map.values()); //arraylist to store result array
        return result; 
    }
    
}