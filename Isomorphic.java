//TC : O(n)
//SC : O(n)


class Isomorphic {
    public boolean isIsomorphic(String s, String t)
    {
    HashMap<Character,Character> hm = new HashMap<Character,Character>();
    HashMap<Character,Boolean> hm2 = new HashMap<Character,Boolean>();    
        for(int i=0;i<s.length();i++)
        {
            if(!hm.containsKey(s.charAt(i)))
            {
                if(hm2.containsKey(t.charAt(i)))
                {
                    return false;
                }
             hm.put(s.charAt(i),t.charAt(i)); 
             hm2.put(t.charAt(i),true);   
            }
            char temp=hm.get(s.charAt(i));
                if(temp!=t.charAt(i))
                {
                 return false;
                }
        }
        return true;
    }
}
