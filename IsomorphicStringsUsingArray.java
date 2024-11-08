import java.util.HashMap;

/*
    Time complexity: O(n), where n is the length of the strings s and t.
                    The algorithm iterates through each character of both strings once (in the for loop),
                    making it linear with respect to the string length.

    Space complexity: For the array-based approach with a fixed character set (26 lowercase English letters),
                    the space complexity is O(1) because the space used is constant, independent of the
                    length of the input strings.
 */
class IsomorphicStringsUsingArray {
    public boolean isIsomorphic(String s, String t) {

        if(s==null && t==null) return true;
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;

        /*
            A-Z => 65 to 90 ASCII
            a-z => 97 to 122 ASCII
            256 is Extended ASCII which is not needed

            The 95 characters we are referring to are the printable ASCII characters, which include all characters that are
            typically visible when displayed on a screen or printed on paper. These characters span from ASCII value 32 (space ' ')
            to ASCII value 126 (tilde '~').

            The array sMap holds mappings from characters in string s to characters in string t. The array is sized 95 to
            hold mappings for the 95 printable characters from ASCII 32 (space) to 126 (tilde ~).
         */
        char[] sMap = new char[95];
        char[] tMap = new char[95];

        for(int i=0; i<s.length(); i++)
        {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

           /*
           The reason we subtract ' ' (ASCII 32) from sChar is because ASCII values of printable characters start from 32 (space).
           Subtracting ' ' ensures that the array indices range from 0 to 94 (which covers all printable characters).

            Example: If sChar = 'e' (ASCII 101), we cannot check sMap[101] that will be ArrayOutOFBounds sp:
            sChar - ' ' = 101 - 32 = 69.
            If this if(sMap[sChar - ' '] !=0) is true, it means that the character sChar from string s has already been mapped to some
            character in t in a previous iteration of the loop.
            If no mapping exists yet, sMap[sChar - ' '] will be 0 (which means no mapping has been assigned yet).

            The default value of a char array in Java is '\u0000', which is the null character with ASCII value 0. This is different
            from the numerical value 0 for integers, but it behaves similarly in that it represents an uninitialized state for
            characters in a char array.
            */

            if(sMap[sChar - ' '] !=0)
            {
                /*
                This ensures that the same character in s (sChar) always maps to the same character in t (tChar).
                If the current character tChar does not match the stored mapping for sChar, it means the mapping
                is inconsistent, and the function returns false.
                 */
                if(sMap[sChar - ' '] !=tChar) return false;
            }
            else {
                sMap[sChar - ' '] = tChar;
            }

            //Do the same for tMap
            if(tMap[tChar - ' '] !=0)
            {
                if(tMap[tChar - ' '] !=sChar) return false;
            }
            else {
                tMap[tChar - ' '] =sChar;
            }
        }

        return true;
    }
}