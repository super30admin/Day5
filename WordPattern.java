//T.C = O(n) where n is no of words in string
//S.C = O(1)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> h1 = new HashMap<>();
        HashMap<String,Character> h2 = new HashMap<>();
        
        String[] words = s.split(" ");
        if (words.length != pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            char c = pattern.charAt(i);
            String word = words[i];
            
            if(!h1.containsKey(c))
            {
                h1.put(c,word);
            }
            else if(!h1.get(c).equals(word))
            {
                return false;
            }
            
            
        }
        for(int i=0;i<words.length;i++)
        {
            char c = pattern.charAt(i);
            String word = words[i];
            
            if(!h2.containsKey(word))
            {
                h2.put(word,c);
            }
            else if(h2.get(word)!=c)
            {
                return false;
            }
            
            
        }
        return true;
    }
}