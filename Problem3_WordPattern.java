//Time Complexity : o(n)
//Space Complexity : o(m)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] str=s.split(" ");
        
        HashMap<Character,String> hm=new HashMap<Character,String>();
        if (str.length != pattern.length())
        return false;
        for(int i=0;i<str.length;i++)
        {
            char ch=pattern.charAt(i);
            
            if(hm.containsKey(ch))
            {
                
               if(str[i].equalsIgnoreCase(hm.get(ch)) && i==str.length-1)
	            		return true;
	           if(str[i].equalsIgnoreCase(hm.get(ch)))
	                   continue;
	            else
	                 return false;
            }
            else
            {
                if(hm.containsValue(str[i]))
                    return false;
                else
                hm.put(ch,str[i]);
            }
        }
        return true;
    }
}