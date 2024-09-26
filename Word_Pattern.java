package com.s30.satish;

import java.util.HashMap;
import java.util.Map;

class Word_Pattern {
	public boolean wordPattern(String pattern, String s) {
		String[] strArray = s.split(" ");
		
		if(strArray.length != pattern.length())
			return false;
		
		Map<Character, String> map = new HashMap<>();
		
		for(int i = 0; i < pattern.length(); i++)
		{
			char charElement = pattern.charAt(i);
			
			if(map.containsKey(charElement))
			{
				if(!map.get(charElement).equals(strArray[i]))
					return false;
				else
					continue;
			}
			else
			{
				if(map.containsValue(strArray[i]))
					return false;
				else
					map.put(charElement, strArray[i]);
			}	
		}

		return true;
	}
    
    public static void main(String[] args)
    {
    	String pattern = "abba";
    	String s = "dog cat cat fish";
    	Word_Pattern tObj = new Word_Pattern();
    	System.out.println(tObj.wordPattern(pattern, s));

    	
    }
    

}

