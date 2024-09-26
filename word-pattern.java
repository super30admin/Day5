//Time Complexity: O(n)
//Space Complexity: O(1), because it shows 1:1 mapping and only for lower case alphabets there are only 26 at max.
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        //get words from the string (removing space)
        String[] words = s.split(" ");
        
        //check if length of the string and the pattern is same (not given in question)
        if (pattern.length() != words.length)
        {
            return false;
        }
        
        //map each character in pattern to the word in string s
        HashMap<Character, String> pMap = new HashMap<>();
        //map each word in string s to each character in pattern to the
        HashMap<String, Character> sMap = new HashMap<>();
        
        for (int i=0; i < words.length; i++)
        {
            char pChar = pattern.charAt(i);
            String s1 = words[i]; 
            
            if (!pMap.containsKey(pChar))
            {
                pMap.put(pChar, s1);
            }
            else
            {
                System.out.println(pMap.get(pChar));
                System.out.println(s1);
                //if (pMap.get(pChar) != s1)
                if (!(pMap.get(pChar)).equals(s1))
                {
                    return false;
                }
            }
            
            if (!sMap.containsKey(s1))
            {
                sMap.put(s1, pChar);
            }
            else
            {
                if(sMap.get(s1) != pChar)
                {
                    return false;
                }
            }
        }
        return true;
}
}
