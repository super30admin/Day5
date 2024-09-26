class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> h1=new HashMap<>();
        HashMap<Character,Boolean> h2=new HashMap<>();
        
        if(s.length()!=t.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            char b=t.charAt(i);
            
            if(h1.containsKey(a))
            {
                if(h1.get(a)!=b)
                {
                    return false;
                }
            }
            else
            {
                if(h2.containsKey(b))
                {
                    return false;
                    
                }
                else
                {
                    h1.put(a,b);
                    h2.put(b,true);
                }
            }
            
        }
        return true;
    }
}
