using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algorithms
{
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
    public class WordPatternAlgorithm
    {
        //Time Complexity  - O(n) - for iterating through the pattern string and do the operations
        //Space Complexity - O(1) - Ideally it should be O(26) since we can have a maximum of 26 mappings (26 alphabets). Since this is
        // constant, we could say it is O(1) space
        public bool WordPattern(string pattern, string s)
        {
            if (pattern == null || pattern.Length == 0 || s == null || s.Length == 0) return false;

            var words = s.Split(' ').ToList();
            if (pattern.Length != words.Count) return false;

            var patternMap = new Dictionary<string, char>();
            var stringMap = new Dictionary<char, string>();

            // Map values on both directions from pattern -> s and s-> pattern and verify on the values
            // for false condition otherwise return true
            for (int i = 0; i < pattern.Length; i++)
            {    
                var pWord = words[i];
                var sChar = pattern[i];

                if (!patternMap.ContainsKey(pWord))
                {
                    patternMap.Add(pWord, sChar);
                }
                else
                {
                    patternMap.TryGetValue(pWord, out char value);
                    if (sChar != value) return false;
                }

                if (!stringMap.ContainsKey(sChar))
                {
                    stringMap.Add(sChar, pWord);
                }
                else
                {
                    stringMap.TryGetValue(sChar, out string word);
                    if (pWord != word) return false;
                }
            }
            return true;
        }
    }
}
