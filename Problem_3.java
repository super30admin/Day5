/*
   
word pattern
*/

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public static boolean wordPattern(String pattern, String str) 
    {
	  String a[] = str.split(" ");
	  if(a.length != pattern.length()) 
          return false;
	  
	  HashMap<Character,String> map = new HashMap<Character, String>();
	  
	  for(int i =0; i < pattern.length(); i++)
      {
		  if(!map.containsKey(pattern.charAt(i)))
          {
			  //case where pattern = "abba" str = "dog dog dog dog" 
			  if(map.containsValue(a[i]))
              {
				  return false;
			  }
			  if(map.containsValue(a[i]))
              {
                  return false;
              }
			  map.put(pattern.charAt(i), a[i]);
		  }
          else
          {
			  String value = map.get(pattern.charAt(i));
			  if(!value.equals(a[i]))
              {
				  return false;
		      }
	       }		 
      }	  
	  return true;
  }
}