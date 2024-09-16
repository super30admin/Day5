//exact same algo as word pattern
//Time - O(n) - n -> length of s
//Space - O(n) - n -> length of s

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character, Character> result = new HashMap<Character, Character>();
        HashSet<Character> support = new HashSet<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(result.containsKey(ch))
            {
                if(!result.get(ch).equals(t.charAt(i)))
                {
                    return false;
                }
            }
            else
            {
                if(support.contains(t.charAt(i)))
                {
                    return false;
                }
                result.put(ch, t.charAt(i));
                support.add(t.charAt(i));
            }
        }
        return true;
    }
}
