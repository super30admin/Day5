//Time Complexity: O(nklogk)
//Space Complexity: constant
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Anagrams {
    public List<List<String>> groupAnagrams)String[] strs){
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs){ //take each string
           char[] c = str.toCharArray(); // convert it to char array
           Arrays.sort(c); // sort the char array
           String key = String.valueOf(c);
           if(!map.containsKey(key))
               map.put(key,new ArrayList<>()); //check if the map contains the key
           map.get(key).add(str); // add the str to the respective key list
       }
       return new ArrayList(map.values());
    }
}
