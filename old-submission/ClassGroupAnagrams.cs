using System.Collections;

namespace LeetCodeSubmission.Hashing1;

public class ClassGroupAnagrams
{
    public IList<IList<string>> GroupAnagrams(string[] strs)
    {
        IList<IList<string>> result = new List<IList<string>>();
        
        // initialize a hashMap in C#
        Dictionary<string,IList<string>> anagrams = new Dictionary<string, IList<string>>();

        // add the pairs inside the dictionary
        for (int i = 0; i < strs.GetLength(0); i++)
        {
            // sort the word
            string sortedWord = new string(strs[i].OrderBy(c => c).ToArray());
            
            // chk if the sortedWord exist in the dictionary
            if (anagrams.ContainsKey(sortedWord))
            {
                IList<string> localList;
                if (anagrams.TryGetValue(sortedWord, out localList))
                {
                    // add the strs[i] word to the sorted-list
                    localList.Add(strs[i]);
                    anagrams[sortedWord] = localList;
                }
            }
            else
            {
                // seen this key for the first time
                IList<string> localList = new List<string>();
                localList.Add(strs[i]);
                anagrams.Add(sortedWord,localList);
            }
        }
        
        // iterate the dictionary and add the values inside the Array-list
        foreach (KeyValuePair<string, IList<string>> pair in anagrams)
        {
            Console.WriteLine("{0}, {1}", pair.Key, pair.Value);
            result.Add(pair.Value);
        }
        return result;
    }
}