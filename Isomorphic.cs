public class Solution 
{
    // Time Complexity: O(n), where n is the length of the input strings s and t.
    // Space Complexity: O(n), where n is the length of the input strings s and t.
    public bool IsIsomorphic(string s, string t) 
    {
        Dictionary<char, char> mapping = new Dictionary<char, char>();
        HashSet<char> mappedValues = new HashSet<char>();

        for (int i = 0; i < s.Length; i++) {
            char charS = s[i];
            char charT = t[i];

            if (mapping.ContainsKey(charS)) {
                if (mapping[charS] != charT) {
                    return false;
                }
            } 
            else 
            { 
                if (mappedValues.Contains(charT)) {
                    return false;
                }
                mapping[charS] = charT;
                mappedValues.Add(charT);
            }
        }

        return true;
    }
}
