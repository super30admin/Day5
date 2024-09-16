//Time complexity : O(N)
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())
            return false;

        HashMap h = new HashMap();
        HashSet hs = new HashSet();
        for(int i=0;i<s.length();i++)
        {
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            if(h.get(s1)==null)
            {
                h.put(s1,t1);
                if(hs.contains(t1))
                    return false;
                else
                    hs.add(t1);
            }
            else
            {
                if(!h.get(s1).equals(t1))
                    return false;
            }
        }

        return true;
    }
}