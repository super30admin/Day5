class Solution {
    public boolean isIsomorphic(String s, String t) {
      // with one hashmap - does not work here, as the same letter can have different mapping from t to s, adn it will be lost
      
      // // with two hashmaps
        if(s.length() != t.length()){
          return false;
        }
      int n = s.length();
      HashMap<Character,Character> hmap = new HashMap<>();
      
      HashMap<Character,Character> hmap2 = new HashMap<>();
      
      for(int i=0;i<n;i++){
        char chs = s.charAt(i);
        char cht = t.charAt(i);
        if(hmap.containsKey(chs)) {
          if(cht != hmap.get(chs))
          return false;
          
        }
        hmap.put(chs,cht);
        
        if(hmap2.containsKey(cht)) {
          if(chs != hmap2.get(cht))
          return false;
          
        }
        hmap2.put(cht,chs);
        
        
        
      }
      
      
      
      return true;
      
     
      
    }
}
