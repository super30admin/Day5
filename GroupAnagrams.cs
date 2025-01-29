public class Solution {
    // Time Complexity: O(n * k log k), where n is the number of strings and k is the average length of each string.
    // Space Complexity: O(n * k), where n is the number of strings and k is the average length of each string.
    
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        Dictionary<string, IList<string>> anagramGroups = new Dictionary<string, IList<string>>();

        foreach (string str in strs)
        {
            char[] charArray = str.ToCharArray();
            Array.Sort(charArray);
            string sortedStr = new string(charArray);

            if (!anagramGroups.ContainsKey(sortedStr))
            {
                anagramGroups[sortedStr] = new List<string>();
            }

            anagramGroups[sortedStr].Add(str);
        }

        return new List<IList<string>>(anagramGroups.Values);
    }
}