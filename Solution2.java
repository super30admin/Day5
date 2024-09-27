// Time Complexity : o(n)
// Space Complexity :o(2n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> str1 = new HashMap();
        HashMap<String, Character> str2 = new HashMap();
        
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        
        for(int i=0; i<words.length ; i++)
        {
            char a = pattern.charAt(i);
            String b = words[i];
            
            if (!str1.containsKey(a))
            {
                if(str2.containsKey(b))
                    return false;
                else
                    str1.put(a,b);
                    str2.put(b,a);
            }
            else
            {
                String w = str1.get(a);
                if(!w.equals(b))
                    return false;
            }
        }
        return true;
    }
}