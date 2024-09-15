
/**
Leet Code Submitted : YES
Time Complexity : O(n)
Space Complexity : O(1)
The idea is to use 2 HashMaps to preserved the mapping of each characters
**/

class Solution {
	public boolean isIsomorphic(String s, String t) {
   	 
    	HashMap<Character,Character> hm1 = new HashMap<>();
    	HashMap<Character,Character> hm2 =  new HashMap<>();
   	 
    	if(s.length() != t.length())
        	return false;
   	 
    	for(int i=0; i<s.length(); i++){
       	 
        	char first  = s.charAt(i);
        	char second = t.charAt(i);
       	 
        	if(hm1.containsKey(first))
        	{
            	if(!hm1.get(first).equals(second))
                	return false;
        	} else{
            	hm1.put(first,second);
            	//hm2.put(second,first);
        	}
       	 
        	if(hm2.containsKey(second))
        	{
          	if(!hm2.get(second).equals(first))
                	return false;
        	} else{
            	hm2.put(second,first);
        	}
       	 
    	}
   	 
    	return true;
   	 
	}
}

