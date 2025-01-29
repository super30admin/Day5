// time complexity - O(N) where N is length of inout strings
// space complexity - O(1) constant as it is capped at number of ascii characters that is 256
// Execuited successfully on leet code - yes
// approach - Use two disctionaries one for s and one for t, to map the corrosponding char.
// Any time the key exists check corrosponding value if is is same as charactor in opposite string.
//if not return false

public class Solution
{
    public bool IsIsomorphic(string s, string t)
    {
        if (s.Length != t.Length)
        {
            return false;
        }

        Dictionary<char, char> sMap = new Dictionary<char, char>();
        Dictionary<char, char> tMap = new Dictionary<char, char>();

        for (int i = 0; i < s.Length; i++)
        {
            if (!sMap.ContainsKey(s[i]))
            {
                sMap.Add(s[i], t[i]);
            }
            else
            {
                if (sMap[s[i]] != t[i])
                {
                    return false;
                }
            }
        }
        for (int i = 0; i < t.Length; i++)
        {
            if (!tMap.ContainsKey(t[i]))
            {
                tMap.Add(t[i], s[i]);
            }
            else
            {
                if (tMap[t[i]] != s[i])
                {
                    return false;
                }
            }
        }
        return true;
    }
}