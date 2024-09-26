public class Solution {
    public bool WordPattern(string pattern, string s) {
        string[] tokens = s.Split(" ", StringSplitOptions.RemoveEmptyEntries);
       
        if (pattern.Length != tokens.Length) { return false; }
        
        Dictionary<char, string> lookup = new Dictionary<char, string>();
        HashSet<string> inUse = new HashSet<string>();
        
        for(int i=0; i< pattern.Length; i++)
        {
            if (lookup.ContainsKey(pattern[i]))
            {
                if (lookup[pattern[i]] != tokens[i]) { return false; }
            }
            else if (inUse.Contains(tokens[i])) { return false; }
            else
            {
                lookup[pattern[i]] = tokens[i];
                inUse.Add(tokens[i]);
            }
        }
        
        return true;
        
    }
}
