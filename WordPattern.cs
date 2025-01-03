public class Solution
{
    public bool WordPattern(string pattern, string s)
    {
        Dictionary<char, string> lookup = new Dictionary<char, string>();
        HashSet<string> hashset = new();
        var sArray = s.Split(' ');

        if (pattern.Length != sArray.Length)
        {
            return false;
        }

        if (pattern.Length == 1 && sArray.Length == 1)
        {
            return true;
        }

        for (int i = 0; i < pattern.Length; i++)
        {
            if (lookup.ContainsKey(pattern[i]))
            {
                if (!lookup[pattern[i]].Equals(sArray[i]))
                {
                    return false;
                }
            }
            else
            {
                lookup.Add(pattern[i], sArray[i]);
                if (hashset.Contains(sArray[i]))
                {
                    return false;
                }
                hashset.Add(sArray[i]);
            }
        }
        return true;
    }
}