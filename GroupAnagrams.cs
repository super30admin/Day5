//Time Complexity: O(n) for storing results from PrimeProduct
//Space Complexity: O(n)
public class Solution {
           public IList<IList<string>> GroupAnagrams(String[] strs)
        {
            IList<IList<string>> result = new List<IList<string>>();
            if (strs == null || strs.Length == 0)
            {
                return result;
            }
            Dictionary<long, List<string>> map = new Dictionary<long, List<string>>();
            foreach (string str in strs)
            {
                long Product = PrimeProduct(str);
                if (!map.ContainsKey(Product))
                {
                    map.Add(Product, new List<string>());
                }
                map[Product].Add(str);
            }
            result = new List<IList<string>>(map.Values);
            return result;
        }

        private long PrimeProduct(string str)
        {
            int[] primes = { 2,3,5,7,11,13,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
            long result = -1;
            for(int i = 0; i< str.Length; i++)
            {
                char c= str.ToCharArray()[i];
                result = result * primes[c - 'a'];
            }
            return result;
        }
}