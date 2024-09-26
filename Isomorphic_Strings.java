package com.s30.satish;

import java.util.HashMap;
class Isomorphic_Strings {
public boolean isIsomorphic(String s, String t) {
	char[] sArray = new char[100];
	char[] tArray = new char[100];
	
	if(s.length() != t.length())
		return false;
	for(int i = 0; i < s.length(); i++)
	{
		char sCh = s.charAt(i);
		char tCh = t.charAt(i);
		
		if(sArray[sCh - ' '] != 0)
		{
			if(sArray[sCh - ' '] != tCh)
				return false;
		}
		else
			sArray[sCh - ' '] = tCh;
		
		if(tArray[tCh - ' '] != 0)
		{
			if(tArray[tCh - ' '] != sCh)
				return false;
		}
		else
			tArray[tCh - ' '] = sCh;
			
	}
	return true;
	
	
//        if(s.length() != t.length())
//        	return false;
//        
//        HashMap<Character, Character> sMap = new HashMap<>();
//
//        for(int i = 0; i < s.length(); i++)
//        {
//        	char sChar = s.charAt(i);
//        	char tChar = t.charAt(i);
//        	
//        	if(sMap.containsKey(sChar))
//        	{
//        		if(sMap.get(sChar).equals(tChar))
//        			continue;
//        		else
//        			return false;
//        	}
//        	else
//        	{
//        		if(sMap.containsValue(tChar))
//        			return false;
//        		else
//        			sMap.put(sChar, tChar);
//        	}	
//        }
//        return true;
        
	}

	public static void main(String[] args)
	{
		String s = "egg";
		String t = "add";
		Isomorphic_Strings ismrpcObj = new Isomorphic_Strings();
		System.out.println(ismrpcObj.isIsomorphic(s, t));
		
		
	}



}
