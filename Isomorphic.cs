using System;
using System.Collections.Generic;

namespace Algorithms
{
    public class Isomorphic
    {
        /// Time Complexity : O(n) 
        // Space Complexity :O(1)
        // Did this code successfully run on Leetcode :Yes
        // Any problem you faced while coding this :  Referred Online
        public bool IsIsomorphic(string s, string t)
        {
            if (s == null || t == null) return false;
            if (s.Length != t.Length) return false;
            Dictionary<char, char> map = new Dictionary<char, char>();
            HashSet<char> assignedValues = new HashSet<char>();

            for(int i =0; i < s.Length; i++)
            {
                char sChar = s.ToCharArray()[i];
                char tChar = t.ToCharArray()[i];
                if(map.ContainsKey(sChar) && map.GetValueOrDefault(sChar) != tChar)
                {
                    return false;
                }
                if(!map.ContainsKey(sChar) && assignedValues.Contains(tChar))
                {
                    return false;
                }
                if (!map.ContainsKey(sChar))
                {
                    map.Add(sChar, tChar);
                }
                if (!assignedValues.Contains(tChar))
                {
                    assignedValues.Add(tChar);
                }
                
            }
            return true;
        }
    }
}
