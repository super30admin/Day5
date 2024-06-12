
//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
	// Any problem you faced while coding this : No
	//Your code here along with comments explaining your approach


class Solution {
    public boolean wordPattern(String pattern, String str) {
  
      HashMap<Character,String> map1 = new HashMap<>();
      HashMap<String,Character> map2 = new HashMap<>();  
        
      char[]  pArray = pattern.toCharArray();
      String[] strArray = str.split(" ");  
        
      if(pArray.length != strArray.length)
            return false;
      
     for(int i=0;i<pArray.length;i++){
         
        if(!map1.containsKey(pArray[i]))
            map1.put(pArray[i],strArray[i]);
         else{
             if(!map1.get(pArray[i]).equals(strArray[i])){
                
                 return false;
         }
         }
         
         if(!map2.containsKey(strArray[i]))
             map2.put(strArray[i],pArray[i]);
          else{
              if(!map2.get(strArray[i]).equals(pArray[i])){
                  return false;
              }
          }   
         
     } 
        
        return true;
    }
}