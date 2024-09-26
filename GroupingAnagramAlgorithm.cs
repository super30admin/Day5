using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Algorithms
{
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : No
    public class GroupingAnagramAlgorithm
    {
        //Time Complexity - O(nklogk) -  one O(n) for iterating through the entire string array, second O(n) for getting 
        // the values from the dictionary at the end of the method and O(klogk) for sorting the character array, where
        //k is the length of the individual string
        //Space Complexity - O(nk) - O(n) for the array storage in a hashmap and since we are storing lists for values, O(k) for the list storage
        //where k is the number of elements in the list.
        public IList<IList<string>> GroupAnagrams(string[] strs)
        {
            if (strs == null || strs.Length == 0) return new List<IList<string>>();
            
            var dict = new Dictionary<string, IList<string>>();

            for(var i = 0; i < strs.Length; i++)
            {
                var arr = strs[i].ToCharArray().OrderBy(_ => _).ToArray();
                var sortedKey = new string(arr);
                if (!dict.ContainsKey(sortedKey))
                {
                    dict.Add(sortedKey, new List<string> {strs[i]});
                }
                else
                {
                    //If the mapping already exists for a given key, then get the list value and add the string to that list
                    dict.TryGetValue(sortedKey, out IList<string> groupedList);
                    groupedList.Add(strs[i]);
                }
            }

            return dict.Values.ToList();
        }
    }
}
