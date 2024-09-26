using System.Collections.Generic;

namespace Algorithms
{
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
    public class IsomorphicStrings
    {
        //Time Complexity  - O(n) - for iterating through the pattern string and do the operations
        //Space Complexity - O(1) - Ideally it should be O(26) since we can have a maximum of 26 mappings (26 alphabets). Since this is
        // constant, we could say it is O(1) space
        public bool IsIsomorphic(string s, string t)
        {
            if (t == null || t.Length == 0 || s == null || s.Length == 0 || s.Length != t.Length) return false;

            var sMap = new Dictionary<char, char>();
            var tMap = new Dictionary<char, char>();

            // Map values on both directions from t -> s and s-> t and verify on the values
            // for false condition otherwise return true
            for (int i = 0; i < s.Length; i++)
            {
                var sChar = s[i];
                var tChar = t[i];

                if (!sMap.ContainsKey(sChar))
                {
                    sMap.Add(sChar, tChar);
                }
                else
                {
                    sMap.TryGetValue(sChar, out char tValue);
                    if (tChar != tValue) return false;
                }

                if (!tMap.ContainsKey(tChar))
                {
                    tMap.Add(tChar, sChar);
                }
                else
                {
                    tMap.TryGetValue(tChar, out char sValue);
                    if (sChar != sValue) return false;
                }
            }
            return true;
        }
    }
}
