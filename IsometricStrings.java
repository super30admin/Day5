// Time Complexity : O(n)
// Space Complexity :o(2n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map <Character,Character> map= new HashMap<>();
        List<Character> list=new ArrayList<>();
        int length=s.length();
        char[] sArr=s.toCharArray();
        char[] tArr=t.toCharArray();
        if(s.length()==t.length())
        {
        	for(int i=0;i<length;i++)
        	{
        		if(map.containsKey(sArr[i]))
        		{
        			if(!( map.get(sArr[i])==tArr[i]))
        			{
        				return false;
        			}

        		}
        		else
        		{
        			if(list.contains(tArr[i]))
        			{
        				return false;
        			}
        			else
        			{
        			map.put(sArr[i], tArr[i]);
        			list.add(tArr[i]);
        			}
        		}
        		
        	}
        	
        }
        else {return false;}
        
        return true;
        
        
    }
}