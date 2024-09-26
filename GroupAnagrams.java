package hashing1;

import java.util.*;
//n=length of strs array and k is the maximum length of a string in strs
//Time Complexity : O(n*k)
//Space Complexity : O(n*k)	
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


class Anagram{
	public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0)  return new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap();
        for(String s:strs){
            char ch[]=new char[26];
            for(char c:s.toCharArray()){
                ch[c-'a']++;
            }
            String keyString=String.valueOf(ch);
            if(!map.containsKey(keyString)) map.put(keyString,new ArrayList<String>());
            map.get(keyString).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram sol=new Anagram();
		String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(sol.groupAnagrams(arr));
	}
}