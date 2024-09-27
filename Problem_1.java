class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hmap = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
        // sort the each word
          String word = strs[i];
         char[] chars = word.toCharArray();
         Arrays.sort(chars); //since they are all lower case
         String sorted = new String(chars);
          
          if(!hmap.containsKey(sorted)){
            hmap.put(sorted, new LinkedList<String>());
          }
          hmap.get(sorted).add(word);
        }
      List<List<String>> result =  new LinkedList<List<String>>(hmap.values());
      return result;
    }
}
