//Time Complexity: O(n)  //length of string s
//Space Complexity: O(n)
public class Solution {

      public bool IsIsomorphic(string s, string t)
        {
            if (s == null || s.Length == 0)
            {
                return true;
            }
            if (s.Length != t.Length)
            {
                return false;
            }
            Dictionary<char, char> sMap = new Dictionary<char, char>();
            Dictionary<char, char> tMap = new Dictionary<char, char>();
            for (int i = 0; i < s.Length; i++)
              {
                Char sChar = s.ToCharArray()[i];
                Char tChar = t.ToCharArray()[i];
                if (!sMap.ContainsKey(sChar))
                {
                    sMap.Add(sChar, tChar);
                }
                else
                {
                    if (sMap[sChar] !=  tChar)
                    {
                        return false;
                    }
                }
                if(!tMap.ContainsKey(tChar)){
                    tMap.Add(tChar, sChar);
                }
                else
                {
                    if (tMap[tChar] != sChar)
                    {
                        return false;
                    }
                }
            }
            return true;
        }
}