namespace LeetCodeSubmission.Hashing1;

public class IsomorphicStrings
{
    public bool IsIsomorphic(string s, string t)
    {
        bool result = true;
        
        // base-case
        if (s.Length != t.Length)
        {
            result = false;
            return result;
        }
        
        // initialize dictionary
        Dictionary<char, char> strS = new Dictionary<char, char>();
        Dictionary<char, char> strT = new Dictionary<char, char>();

        for (int i = 0; i < s.Length; i++)
        {
            char charS = s[i];
            char charT = t[i];

            // output chars
            char resS;
            char resT;

            if (strS.ContainsKey(charS) && (strS.TryGetValue(charS, out resS) && resS != charT))
            {
                result = false;
                break;
            }
            else if(strT.ContainsKey(charT) && (strT.TryGetValue(charT, out resT) && resT != charS))
            {
                result = false;
                break;
            }
            else
            {
                // add key-value pair in strS
                strS.TryAdd(charS, charT);

                // add key-value pair in strT
                strT.TryAdd(charT, charS);
            }
        }
        
        return result;
    }
}