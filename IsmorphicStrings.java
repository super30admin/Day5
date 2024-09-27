class Solution {
    public boolean isIsomorphic(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        
        HashMap<Character,Character> map = new HashMap<>();
        HashSet<Character>set = new HashSet<>();
        
        if(lens!=lent)
            return false;
        
        for(int i=0; i<lens; i++)
        {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(!map.containsKey(s.charAt(i)))
            {
                if(!set.contains(t.charAt(i)))
                {
                  map.put(s.charAt(i),t.charAt(i));
                    set.add(t.charAt(i));  
                }
                else
                    return false;
                
            }
            else
            {
                char stored =(char)map.get(cs);
                if(stored == t.charAt(i)){
                    continue;
                }
                else
                    return false;   
            }
        }
        return true;
    }
}