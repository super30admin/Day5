// Time Complexity : O(n) n is length of the strings
// Space Complexity : O(n) - space for map and set
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Isomorphic {

    public boolean isIsomorphic(String s, String t) {

        if(s==null || t==null)
            return false;

        if(s.length() != t.length())
            return false;

        //to map chars of s to t
        HashMap<Character, Character> hm = new HashMap();

        //to make sure same tchar does not map to different schar
        HashSet<Character> hs = new HashSet();

        for(int i=0; i<s.length(); i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            //schar is already in map
            if(hm.containsKey(schar))
            {
                //prev schar has a different tchar mapped to it
                if(hm.get(schar) != tchar)
                    return false;
                //same tchar, nothing to do
            }
            else //schar is not in map yet
            {
                //tchar is already in set, meaning it is already mapped to different schar
                if(hs.contains(tchar))
                    return false;

                //none of the above false conditions matched, put in map and set
                hm.put(schar, tchar);
                hs.add(tchar);
            }
        }

        //no false issues, return true

        return true;
    }
}
