import java.util.HashMap;
import java.util.HashSet;

/*
    Time complexity: O(n), where n is the length of the strings s and t.
                    The algorithm iterates through each character of both strings once (in the for loop),
                    making it linear with respect to the string length.

    Space complexity: O(1) as here in this example, characters are only 26 so even if there is a string of 1 million,
                    the space won't increase after a constant space be lower or upper case characters
 */
class IsomorphicStringsUsingHashSet {
    public boolean isIsomorphic(String s, String t) {

        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;

        HashMap<Character, Character> sMap = new HashMap<>();
        HashSet<Character> tSet = new HashSet<>();

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
                //Now check if the value is present in hashset, if yes then you trying to map the key to a different value which is false
                if(tSet.contains(tChar)) return false;

                tSet.add(tChar);
                sMap.put(sChar, tChar);

            }
        }

        return true;

    }
}