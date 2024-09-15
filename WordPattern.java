// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class WordPattern
 {
    public boolean wordPattern(String pattern, String str) 
    {
      if(pattern == null || str == null) return false;
      String[] strArr = str.split(" ");  
      HashMap<Character, String> hm1 = new HashMap<>();
      HashMap<String, Character> hm2 = new HashMap<>();
      
      if(pattern.length()!=strArr.length) return false; 
      
      for(int i=0;i<pattern.length();i++)
      {
          char c = pattern.charAt(i);
          if(!hm1.containsKey(c))
              hm1.put(c,strArr[i]);
          else if(!hm1.get(c).equals(strArr[i]))
              return false;
          
          if(!hm2.containsKey(strArr[i]))
              hm2.put(strArr[i],c);
          else if(!hm2.get(strArr[i]).equals(c))
              return false;
      }
        return true;
    }
}