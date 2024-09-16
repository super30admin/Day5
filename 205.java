class Solution {
    public boolean isIsomorphic(String s, String t) {

         if (s.length() != t.length()) {
            return false;
        }

     return (checkIsoMorphism(s,t) && checkIsoMorphism(t,s));

    }

    private static boolean checkIsoMorphism(String s,String t)
    {
        HashMap<Character, Character> charMap = new HashMap<>();
        boolean result = true;
        for (int i = 0; i < s.length(); i++) {
            if (!charMap.containsKey(s.charAt(i)))
                charMap.put(s.charAt(i), t.charAt(i));
            else {
                if (!((charMap.get(s.charAt(i))) == t.charAt(i))) {
                    
                    result = false;
                    break;

                }

            }
        }

        return(result);
    
}
}