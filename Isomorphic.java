package Hashing1;
//Time Complexity : O(n) for searching using binary search
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


//Your code here along with comments explaining your approach
// two hashmaps can be used to check the isomorphic property of each strings
// putting each char in an array, we check if it's present in other string

import java.util.HashMap;

public class Isomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "add";
		String t = "egg";
		
		boolean isIsomorphic  = false;
		isIsomorphic = checkIfIsomorphic(s,t);
		System.out.println(isIsomorphic);
	}

	private static boolean checkIfIsomorphic(String s, String t) {
		// TODO Auto-generated method stub
		
		HashMap<Character, Character> sMap = new HashMap<>();
		HashMap<Character, Character> tMap = new HashMap<>();
		
		for(int i=0; i<s.length();i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			if(!sMap.containsKey(sChar)) {
				sMap.put(sChar, tChar);
			}
			else {
				if(sMap.get(sChar) != tChar) return false;
			}
		}
		
		for(int i=0; i<t.length();i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			if(!tMap.containsKey(tChar)) {
				tMap.put(tChar, sChar);
			}
			else {
				if(tMap.get(tChar) != sChar) return false;
			}
		}		
		
		return true;
	}

}
