public class Solution {
public bool IsIsomorphic(string s, string t) {
        if (s.Length != t.Length) { return false; }
        
        int[] sMap = new int[128];
        int[] tMap = new int[128];
        
        for(int i=0; i< s.Length; i++)
        {
            Console.WriteLine(sMap[s[i]]);
            Console.WriteLine(tMap[t[i]]);
            if (sMap[s[i]] == 0 && tMap[t[i]] == 0 )
            {
                sMap[s[i]] = t[i];
                tMap[t[i]] = s[i];
                     Console.WriteLine(sMap[s[i]]);
            Console.WriteLine(tMap[t[i]]);
            }
            else if (sMap[s[i]] != t[i] || tMap[t[i]] != s[i])
            {
                return false;
            }
        }
        
        return true;
    }
}
​
