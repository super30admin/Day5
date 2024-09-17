time complexity: O(n*log(length of longest string))
space complexity: O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) //initial check
      return new ArrayList<>();

    Map<String, List<String>> stringAnagramsMap = new HashMap<>(); //creating a hashmap
    for (String s : strs) { //converting string to char array
      char[] arr = s.toCharArray();
      Arrays.sort(arr); //sorting them
      String key = String.valueOf(arr); 

      if (!stringAnagramsMap.containsKey(key)) //if the hashmap doesnot contains key
        stringAnagramsMap.put(key, new ArrayList<>()); //then put into the hashmap and create a arraylist

      stringAnagramsMap.get(key).add(s); //else just get value of that
    }

    List<List<String>> resultList = new ArrayList<>(); //creating result list
    for (Map.Entry<String, List<String>> stringAnagrams : stringAnagramsMap.entrySet()) {
      resultList.add(stringAnagrams.getValue()); //adding all the hashmap elements/values to result
    }
    return resultList; //returning result list
    }
}