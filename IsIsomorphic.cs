public class Solution
{
    public bool IsIsomorphic(string s, string t)
    {
        if (s.Length != t.Length)
        {
            return false;
        }
        char[] sArray = new char[128];
        char[] tArray = new char[128];
        for (int i = 0; i < s.Length; i++)
        {
            var sIndex = (int)s[i];
            var tIndex = (int)t[i];
            if (sArray[sIndex] == '\0' && tArray[tIndex] == '\0')
            {
                sArray[sIndex] = t[i];
                tArray[tIndex] = s[i];
            }
            if (sArray[sIndex] != t[i] || tArray[tIndex] != s[i])
            {
                return false;
            }
        }
        return true;
    }
}