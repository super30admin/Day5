// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Isomorphic 
{
    public boolean isIsomorphic(String s, String t) 
    {
        HashMap<Character, Character> hm = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>(); 
        
        if(s.length()!=t.length())
            return false;
        
        for(int i=0; i<s.length();i++)
        {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            if(!hm.containsKey(s1))
            {
                hm.put(s1,t1);
            }
            else if(hm.get(s1)!=t1)
            {
                return false;
            }
            
            if(!hm2.containsKey(t1))
                hm2.put(t1,s1);
            else if(hm2.get(t1)!=s1)
                return false;
        }
        return true;
        
    }
}	

public static void main (String[] args) throws java.lang.Exception
	{
		String s = "egg";
		String t = "add";
		Isomorphic obj = new Isomorphic();
		boolean result=obj.isIsomorphic(s,t);
		System.out.println("The given strings are isomorphic: "+result);
	}
}