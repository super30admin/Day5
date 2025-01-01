public class Solution
{
    public IList<IList<string>> GroupAnagrams(string[] strs)
    {
        Dictionary<double, IList<string>> result = new Dictionary<double, IList<string>>();
        foreach (var str in strs)
        {
            var hash = GetHash(str);
            if (!result.ContainsKey(hash))
            {
                result.Add(hash, new List<string>());
            }
            result[hash].Add(str);
        }
        return result.Values.ToList();
    }

    public double GetHash(string str)
    {
        int[] primeNumbers = new int[26] { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
        double result = 1;
        foreach (var s in str)
        {
            var index = s - 'a';
            result = result * primeNumbers[index];
        }
        return result;
    }
}