using System;
using System.Collections.Generic;

namespace Algorithms
{
    /// Time Complexity : O(NKLogK) 
    // Space Complexity :O(NK)
    // Did this code successfully run on Leetcode :Yes
    // Any problem you faced while coding this :  No
    public class GroupAnagrams
    {
        //Use hashmap. Key will be sorted anagram string, value will be list of anagram strings 
        public IList<IList<string>> GroupAnagramsStrings(string[] strs)
        {
            if (strs == null && strs.Length == 0) return new List<IList<string>>();

            Dictionary<string, List<string>> map = new Dictionary<string, List<string>>();

           foreach (string s in strs)
            {
                char[] charArray = s.ToCharArray();
                Array.Sort(charArray);
                string key = new string(charArray);
                if (!map.ContainsKey(key))
                {
                    map.Add(key, new List<string>());
                }
                map.GetValueOrDefault(key).Add(s);
            }

            return new List<IList<string>>( map.Values);

        }
    }
}
