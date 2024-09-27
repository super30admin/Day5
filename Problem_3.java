class Solution {
  // using one hashmap
    // public boolean wordPattern(String pattern, String s) {
    //     HashMap map_index = new HashMap();
    //     String[] words = s.split(" ");
    //     if (words.length != pattern.length())
    //         return false;
    //     for (Integer i = 0; i < words.length; i++) {
    //         char c = pattern.charAt(i);
    //         String w = words[i];
    //         if (!map_index.containsKey(c))
    //             map_index.put(c, i);
    //         if (!map_index.containsKey(w))
    //             map_index.put(w, i);
    //         if (map_index.get(c) != map_index.get(w))
    //             return false;
    //     }
    //     return true;
    // }
  
  
 //using two hashmaps
  public boolean wordPattern(String p, String s) {
     String[] words = s.split(" ");
    
      if(words.length != p.length()){
        return false;
      }
    
      HashMap<Character, String> hmap1 = new HashMap<>();
      HashMap<String,Character> hmap2 = new HashMap<>();
    
      for(int i=0;i<words.length;i++){
        char chp = p.charAt(i);
        String word = words[i];
        if(hmap1.containsKey(chp)){
          if(!hmap1.get(chp).equals(word)){
            return false;
          }
        }
        
        hmap1.put(chp,word);
        
        if(hmap2.containsKey(word)){
          if(!hmap2.get(word).equals(chp)){
            return false;
          }
        }
        
        hmap2.put(word,chp);
        
      }
    
    return true;
  }
}
