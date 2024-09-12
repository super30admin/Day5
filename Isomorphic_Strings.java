class Solution {
    //Time O(N)
    //Space O(1)
/*
  Intution: As It is a one on one relation we can use HashMap datastructure
*/
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for(int i=0 ; i<s.length() ; i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                if(map.get(s.charAt(i)) != t.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(t.charAt(i))) // Fetching will be O(N) through hashmap values
                {
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
        }
        return true;
    }
}