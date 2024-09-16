// Time Complexity :
//      n - length of either string
//      total time complexity will be O(n)
//
// Space Complexity :
//      isIsomorphic() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> shm = new HashMap<>();
        HashMap<Character, Character> thm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!shm.containsKey(s.charAt(i)))
            {
                shm.put(s.charAt(i), t.charAt(i));
            }
            else if(shm.containsKey(s.charAt(i)))
            {
                char a = shm.get(s.charAt(i));
                if(a != t.charAt(i))
                    return false;
            }
            if(!thm.containsKey(t.charAt(i)))
            {
                thm.put(t.charAt(i), s.charAt(i));
            }
            else if(thm.containsKey(t.charAt(i)))
            {
                char b = thm.get(t.charAt(i));
                if(b != s.charAt(i))
                    return false;
            }
        }
        return true;
    }
}