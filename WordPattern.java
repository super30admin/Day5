//Time complexity : O(n)
//Space complexity : O(n)

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> charToStr = new HashMap<>();
        HashMap<String, Character> StrToChar = new HashMap<>();
        
        String[] strings = s.split(" ");
        
        if(pattern.length() != strings.length)
        return false;
        for(int i=0; i<pattern.length(); i++)
        {
            if(!charToStr.containsKey(pattern.charAt(i)))
            {
                charToStr.put(pattern.charAt(i),strings[i]);
            }
            if(!StrToChar.containsKey(strings[i])) 
            {
                StrToChar.put(strings[i], pattern.charAt(i));
            }
            if(!(charToStr.get(pattern.charAt(i)).equals(strings[i]) && StrToChar.get(strings[i]).equals(pattern.charAt(i))))
            {
                return false;
            }
            
        }
        return true;
    }
}