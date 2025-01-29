// time comlplexity- O(n) wher n = length of pattern
// space complexity - O(1) for dict as 26 letters and O(n) to store array of words
// so O(n)
// Ran on leet code - yes
// approach - Use two disctionaries one for pattern and one for s, to map the corrosponding char to word 
// and word to char. Any time the key exists check corrosponding value if is is same as charactor or word in opposite string.
//if not return false


public class Solution
{
    public bool WordPattern(string pattern, string s)
    {
        Dictionary<char, string> pDict = new Dictionary<char, string>();
        Dictionary<string, char> sDict = new Dictionary<string, char>();

        string[] sArray = s.Split(' ');

        if (sArray.Length != pattern.Length)
        {
            return false;
        }
        for (int i = 0; i < pattern.Length; i++)
        {
            if (!pDict.ContainsKey(pattern[i]))
            {
                pDict.Add(pattern[i], sArray[i]);
            }
            else
            {
                if (!pDict[pattern[i]].Equals(sArray[i]))
                {
                    return false;
                }
            }
        }
        for (int i = 0; i < pattern.Length; i++)
        {
            if (!sDict.ContainsKey(sArray[i]))
            {
                sDict.Add(sArray[i], pattern[i]);
            }
            else
            {
                if (sDict[sArray[i]] != (pattern[i]))
                {
                    return false;
                }
            }
        }
        return true;
    }
}