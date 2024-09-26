//O(n): TC
//O(n): SC
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(t.length() != s.length()) return false;
        HashMap <Character, Character> StoTmap = new HashMap<>();
        HashMap <Character, Character> TtoSmap = new HashMap<>();
        
        for(int x=0;x<s.length();x++)
        {
            char chs = s.charAt(x);
            char cht = t.charAt(x);
            //s->t
            if(StoTmap.containsKey(chs) && StoTmap.get(chs)!=cht)
            {
                return false;
            }
            else
            {
                StoTmap.put(chs,cht);
            }
            if(TtoSmap.containsKey(cht) && TtoSmap.get(cht)!=chs)
            {
                return false;
            }
            else
            {
                TtoSmap.put(cht,chs);
            }
        }
        return true;
    }
}