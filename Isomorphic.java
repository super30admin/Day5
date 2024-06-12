
//Time Complexity : O(n)
//Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
	// Any problem you faced while coding this :  Initially
	// I had taken only one HashMap and then later got to know that I had a take two hashmaps for
	//   two way mapping
	//Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        
      if(s.length() != t.length())
        return false;
        
      HashMap<Character,Character> map1 =new HashMap<>();
      HashMap<Character,Character> map2 = new HashMap<>();

     
     char[] sArray = s.toCharArray();
     char[] tArray =t.toCharArray();
     
   for(int i=0 ;i < sArray.length;i++){
      if(!map1.containsKey(sArray[i]))
          map1.put(sArray[i],tArray[i]);
       else
       {
           if(map1.get(sArray[i])!=tArray[i])
               return false;
        } 
       if(!map2.containsKey(tArray[i]))
           map2.put(tArray[i],sArray[i]);
       else
       {
           if(map2.get(tArray[i])!=sArray[i])
               return false;
           
       }
   }
        
        return true;
    }
}