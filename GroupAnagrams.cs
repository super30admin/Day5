// time complexity  - O(logn+k) n is length of strs and k is avg length of words in strs
// space complexity - O(n) where n is length of strs
// worked on leet code - yes
//  approach - Iterate over the strs array, sort each string and check if sorted string present 
// in dict, if yes append the work to list if not add it and initiate a list
// at end return the list of values in the dict 
public class Solution
{
    public IList<IList<string>> GroupAnagrams(string[] strs)
    {
        Dictionary<string, IList<string>> stringMap = new Dictionary<string, IList<string>>();

        for (int i = 0; i < strs.Length; i++)
        {
            char[] arr = strs[i].ToCharArray();
            Array.Sort(arr);
            string sorted = new String(arr);
            Console.WriteLine(sorted);
            if (!stringMap.ContainsKey(sorted))
            {
                stringMap.Add(sorted, new List<string> { strs[i] });
            }
            else
            {
                stringMap[sorted].Add(strs[i]);
            }
        }
        return stringMap.Values.ToList();
    }
}