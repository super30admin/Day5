package hashing1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
//Time Complexity : O(1)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


class Solution{
	public boolean wordPattern(String pattern, String str) {
        Set<String> set=new HashSet();
        String arr[]=str.split(" ");
        if(pattern.length()!=arr.length)    return false;
        HashMap<Character,String> map=new HashMap();
        for(int i=0;i<pattern.length();i++){   
            if(!map.containsKey(pattern.charAt(i)) && set.contains(arr[i])){
                return false;
            }
            else if(!map.containsKey(pattern.charAt(i))){
                map.put(pattern.charAt(i),arr[i]);
            }else if(!map.get(pattern.charAt(i)).equals(arr[i])){
                return false;
            }
            set.add(arr[i]);
        }
        return true;
    }
}
public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution sol=new Solution();
		String pattern = "abba", str = "dog cat cat dog";
		System.out.println(sol.wordPattern(pattern, str));	//returns true
	}

}
