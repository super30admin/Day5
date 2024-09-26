class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hmap = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        if(s.length() != t.length())
            return false;
        
        for(int i=0; i<s.length(); i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);
            
            if(!hmap.containsKey(a))
            {
                if(set.contains(b))
                    return false;
                hmap.put(a,b);
                set.add(b);
            }
            else
            {
                if(hmap.get(a) != b)
                    return false;
            }
        }
        
        return true;
    }
}

// TC- O(N) where N is the length of string
// SC- O(N) since we use hashmap and hashset that store all the number of characters
/* Logic-
- Add the character correlation in a hashmap
- Add the visited character from second string in a hashset
- If the second string character is already visited then there are more than one characters in first string that correspond to one character in second string. Therefore, return false.
*/
