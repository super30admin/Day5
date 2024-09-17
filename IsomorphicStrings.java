
class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sToTMap = new HashMap<>();
        Map<Character, Character> tToSMap = new HashMap<>();
        for (int i =0; i< s.length() ;++i)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(sToTMap.containsKey(sChar))
            {
                char mappedChar = sToTMap.get(sChar);
                if(mappedChar!= tChar)
                {
                    return false;

                }
            }
            else{
                sToTMap.put(sChar, tChar);
            }
            if(tToSMap.containsKey(tChar))
            {
                char mappedChar = tToSMap.get(tChar);
                if(mappedChar != sChar)
                {
                    return false;
                }
            }
            else{
                tToSMap.put(tChar,sChar);
            }
        }
        return true;
    }

}