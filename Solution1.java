/* 
This did not work on leetcode
Time complexity- o(n)- Because we traverse each and every character in the string.
Space complexity - o(n) because we store 2 maps and iterate over it.
*/



class Solution1 {
    public boolean isIsomorphic(String s, String t) {
      Map<Character,Character> smap= new HashMap<>(); //putting in the characters in this map
        if(s.length()!=t.length()){ //if lengths are not equal then I need to straght away say false
            return false;
        }
    Map<Character,Character> tmap= new HashMap<>(); // maintaining a map to store the t characters
        
for(int i=0;i<s.length();i++)
{
   Character schar= s.charAt(i); checking each and every character in the string
   Character tchar= t.charAt(i);
    
    if(smap.containsKey(schar)) //if it already contains the previously occured string.
    {
        if(schar!=smap.get(schar))
            return false;
    }
    if(tmap.containsKey(tchar)) // same we are checking for t map as well because of isomotric characters.
    {
        if(tchar!=smap.get(tchar))
            return false;
    }
    smap.put(schar,tchar);
    tmap.put(tchar,schar);
    
}        
   return true; 
    }
}
