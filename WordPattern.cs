//Time Complexity: O(n) //length of pattern
//Space Complexity: O(n)
public class Solution {
      public bool WordPattern(string pattern, string s)
        {
            if (pattern == null || pattern.Length == 0)
            {
                return false;
            }
            String[] strArray = s.Split(" ");
            if (strArray.Length != pattern.Length)
            {
                return false;
            }
            Dictionary<char, string> pMap = new Dictionary<char, string>();
            Dictionary<string, char> sMap = new Dictionary<string, char>();
            for(int i =0;i<pattern.Length;i++)
            {
                char c = pattern.ToCharArray()[i];
                string str = strArray[i];
                if (!pMap.ContainsKey(c))
                {
                    pMap.Add(c, str);
                }
                else
                {
                    if (pMap[c] != str)
                    {
                        return false;
                    }
                }
                if (!sMap.ContainsKey(str))
                {
                    sMap.Add(str, c);
                }
                else
                {
                    if (sMap[str] != c)
                    {
                        return false;
                    }
                }
            }
            return true;
        }
}