//Run successfully on LeetCode: Yes
//Time Complexity:O(L) - length of the longest string 
//Space Complexity: O(n) - constant space

import java.util.HashMap;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        
        for(int i = 0; i < s.length();i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            
            if(sMap.containsKey(sChar))
               {
                   if(sMap.get(sChar) != tChar) 
                       return false;
               }else
               {
                   sMap.put(sChar,tChar);
               }
               
               if(tMap.containsKey(tChar))
               {
                   if(tMap.get(tChar) != sChar)return false;
               }else
                   {
                       tMap.put(tChar,sChar);
                   }
               }
               return true;
    }

    public static void main(String[] args) {
        Isomorphic iso = new Isomorphic();
        System.out.println(iso.isIsomorphic("egg", "add"));
        System.out.println(iso.isIsomorphic("yolo", "toll"));
    }
}