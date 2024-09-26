class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        HashMap<Character, String> chToStr = new HashMap<>();
        HashMap<String, Character> strToCh = new HashMap<>();
        String []strs = s.split(" ");
        if (pattern.length()!= strs.length)
            return false;
        for (int i=0; i<pattern.length(); i++)
        {
            if(!chToStr.containsKey(pattern.charAt(i)))
                chToStr.put(pattern.charAt(i),strs[i]);
            if(!strToCh.containsKey(strs[i]))
                strToCh.put(strs[i],pattern.charAt(i));
            if(!(chToStr.get(pattern.charAt(i))==strs[i] && strToCh.get(strs[i])==pattern.charAt(i)))
                return false;
        }
        return true;
        
    }
}
