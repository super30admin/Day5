// Time Complexity : O(n), we need to traverse the input from 1 to n, even though hash lookup is contant O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//https://leetcode.com/problems/group-anagrams/
//one hashmap and 1 hash set
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        
        if(strs == null || strs.Length == 0)
            return new List<IList<string>>();
        
        Dictionary<string, HashSet<string>> map = new Dictionary<string, HashSet<string>>();
        
        foreach(string str in strs)
        {
            char[] charArray = str.ToChar();
            var sortedArray = Array.Sort(charArray);
            
            if(!map.ContainsKey(sortedArray))
                map.Add(sortedArray, new HashSet<string>{str});
            
            map[sortedArray].Add(str);
            
        }
        
        return map.Values()
    }

//Another opproach to treat each chars ar prime numbers and calculate their product and save their prodyct with product as key/value in hashmap
//productof prme number is unique that way we can group anagrams words together based on the prodouct
//O(1), O(1)
    public IList<IList<string>> GroupAnagrams(string[] strs)
        {
            if (strs == null || strs.Length == 0)
                return new List<IList<string>>();

            List<IList<string>> result = new List<IList<string>>();
            Dictionary<double, List<string>> map = new Dictionary<double, List<string>>();

            foreach (string str in strs)
            {
                double primeProduct = getPrimeProduct(str);

                if (!map.ContainsKey(primeProduct))
                    map.Add(primeProduct, new List<string>());

                map[primeProduct].Add(str);

            }

            foreach (var va in map.Values)
                result.Add(va.ToList());

            return result;
        }

        private double getPrimeProduct(string str)
        {
            double result = 1;
            int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103 };

            for (int i = 0; i < str.Length; i++)
            {
                char c = str[i];
                int prime = primes[c - 'a'];
                result *= prime;
            }
            return result;
        }