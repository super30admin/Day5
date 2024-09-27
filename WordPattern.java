//Time Complexity : O(log n) as we performed binary search on small part of an array expected to have a target
//Space Complexity : O(1) as it's taking contant space
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

//Your code here along with comments explaining your approach


import java.util.*;


public class WordPattern {
	    public static boolean wordPatterns(String pattern, String s) {
	        String[] sArr = s.split(" "); //split string words by space as separate elements in sAarr
	        if(pattern.length() != sArr.length) return false;
	        
	        HashMap<Character, String> pmap= new HashMap<>();  //created 2 hashMaps because both way it pattern should be unique and matched
	        //for bijection
	        HashMap<String, Character> smap= new HashMap<>();
	        for(int i=0; i<pattern.length(); i++)
	        {
	            char pch= pattern.charAt(i);   // storing each pattern string's character in a char pch variable while iterating
	            String str= sArr[i];          // storing each word in string str from sArr
	            
	            if(pmap.containsKey(pch))    //if key(pattern char value is taken here as key) already present then check the value against it
	            { 
	                if(!str.equals(pmap.get(pch)))
	                {
	                       return false;      //if value mismatched , then return false
	                }
	            }
	            else{
	                pmap.put(pch, str);         // else add key value pair into hashmap pmap
	            }
	            
	            if(smap.containsKey(str))     //now check vice-versa whether key(s's string value as key) is present in hashmap smap or not? if present is thevaluye gainst it is equasl to pch?
	            {
	                if(smap.get(str) != pch) {
	                       return false;    ///if not then return false
	                }
	            }
	            else{
	                smap.put(str, pch);       //else add key , value pair into Hashmap smap 
	            }
	        }
	        return true;   //otherwise return true
	}
	    
	public static void main(String[] args) {
		String pattern="abbaa";
		String s = "dog cat cat dog";
		
		boolean bool= wordPatterns(pattern,s);
		if(bool == true)
		{
			System.out.println("The strings patterns are matching");
		}
		else
		{
			System.out.println("The strings patterns are not matching");
		}

	}

	}

