import java.util.HashMap;

/*
    Time complexity: O(n), where n is the length of the strings s and t.
                    The algorithm iterates through each character of both strings once (in the for loop),
                    making it linear with respect to the string length.

    Space complexity: O(1) as here in this example, characters are only 26 so even if there is a string of 1 million,
                    the space won't increase after a constant space be lower or upper case characters

                    Note: If there was some other string with many characters and not constant, then the space would be O(n)
 */
class IsomorphicStringsUsingHashMap {
    public boolean isIsomorphic(String s, String t) {

        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashMap<Character, Character> tMap = new HashMap<>();

        for(int i=0; i<s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(sMap.containsKey(sChar))
            {   /*
                eg: egg, add
                Check if the incoming character say t, is equal to "a", but in map it is e:a a!=t so return false
                */
                if(sMap.get(sChar) != tChar) return false;
            }
            else {
                //if not present add in sMap  eg: egg, add so add e:a
                sMap.put(sChar, tChar);
            }

            //Do the same for tMap
            if(tMap.containsKey(tChar))
            {   /*
                eg: egg, add
                Check if the incoming character say s, is equal to "e", but in map it is a:e e!=s so return false
                */
                if(tMap.get(tChar) != sChar) return false;
            }
            else {
                //if not present add in sMap  eg: egg, add so add e:a
                tMap.put(tChar, sChar);
            }
        }

        return true;

    }
}