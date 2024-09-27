//Time Complexity -O(n)
//Space complexity-O(n)
//Approach-creating two hashmaps one to store s to t mapping and vice versa

import java.util.HashMap;

class Sample {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> stoT=new HashMap<>();
         HashMap<Character,Character> ttoS=new HashMap<>();
        
        for (int i=0; i < s.length() ;i++)
        {
            char ch=s.charAt(i);
            char chs=t.charAt(i);
        
        if (stoT.containsKey(ch) && stoT.get(ch) != chs)
        {
            return false;
        }
        else
        {
            stoT.put(ch,chs);
        }
        
         if (ttoS.containsKey(chs) && ttoS.get(chs) != ch)
        {
            return false;
        }
        else
        {
            ttoS.put(chs,ch);
        }
        }
        return true;
        
        
        
    }
}
