using System;
using System.Collections.Generic;

namespace Algorithms
{
    /// Time Complexity : O(N) 
    // Space Complexity :O(M) - M - number of unique words
    // Did this code successfully run on Leetcode :Yes
    // Any problem you faced while coding this :  No
    public class WordPattern
    {
        //similar to isomorphic
        public bool FindWordPattern(string pattern, string s)
        {
            Dictionary<char, string> map_char = new Dictionary<char, string>();
            Dictionary<string, char> map_word = new Dictionary<string, char>();
            string[] words = s.Split(' ');
            if (words.Length != pattern.Length) return false;

            for (int i = 0; i < words.Length; i++)
            {
                char c = pattern.ToCharArray()[i];
                string w = words[i];
                if (!map_char.ContainsKey(c))
                {
                    if (map_word.ContainsKey(w))
                    {
                        return false;
                    }
                    map_char.Add(c, w);
                    map_word.Add(w, c);
                }
                else
                {
                    string existingValue = map_char.GetValueOrDefault(c);
                    if (w != existingValue)
                    {
                        return false;
                    }

                }
            }
            return true;
        }
    }
}
