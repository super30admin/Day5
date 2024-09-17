class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> ttos=new HashMap<>();
        HashMap<Character,Character> stot=new HashMap<>();
        if(s.length()!=t.length())
            return false;
        for(int i=0;i<s.length();i++)
        {
           
            if(ttos.containsKey(t.charAt(i)))
            {
                if(ttos.get(t.charAt(i))!=s.charAt(i))
                    return false;
            }
            else
            {
                ttos.put(t.charAt(i),s.charAt(i));
            }
            if(stot.containsKey(s.charAt(i)))
            {
                if(stot.get(s.charAt(i))!=t.charAt(i))
                    return false;
            }
            else
            {
                stot.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}