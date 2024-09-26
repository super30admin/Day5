//O(n): TC
//O(n): SC
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> chToStr = new HashMap<>();
        HashMap<String, Character> StrToch = new HashMap<>();
        
        String []str = s.split(" ");
        if(pattern.length() != str.length)return false;
        for(int i =0 ; i<pattern.length();i++)
        {   char charp = pattern.charAt(i);
                
            if(chToStr.containsKey(charp) && !(chToStr.get(charp).equals(str[i])))
                return false;
            else
            {
                chToStr.put(charp, str[i]);
            }
            if(StrToch.containsKey(str[i]) && !(StrToch.get(str[i]).equals(charp)))
                return false;
            else
            {
                StrToch.put(str[i],charp);
            }
        }
        return true;
        
    }
}