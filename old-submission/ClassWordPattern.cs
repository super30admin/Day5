namespace LeetCodeSubmission.Hashing1;

public class ClassWordPattern
{
    public bool WordPattern(string pattern, string str)
    {
        // convert str to s-array
        string[] s = str.Split(' ');
        
        bool result = true;
        
        // base-case
        if (pattern.Length != s.Length)
        {
            result = false;
            return result;
        }
        
        // initialize dictionary
        Dictionary<char, string> strPattern = new Dictionary<char, string>();
        Dictionary<string, char> strS = new Dictionary<string, char>();

        for (int i = 0; i < s.Length; i++)
        {
            char charPattern = pattern[i];
            string charS = s[i];

            // output pairs
            string resPattern;
            char resS;

            if (strPattern.ContainsKey(charPattern) && (strPattern.TryGetValue(charPattern, out resPattern) && resPattern != charS))
            {
                result = false;
                break;
            }
            else if(strS.ContainsKey(charS) && (strS.TryGetValue(charS, out resS) && resS != charPattern))
            {
                result = false;
                break;
            }
            else
            {
                // add key-value pair in strS
                strPattern.TryAdd(charPattern, charS);

                // add key-value pair in strT
                strS.TryAdd(charS, charPattern);
            }
        }
        
        return result;
    }
}