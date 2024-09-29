// TC: //O(N(KLogK+O(K)))
//not sur eif this is optimized solution, tried with commented code as well 
// got TC: O(n(klog k))

public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        IList<IList<string>> result = new List<IList<string>>();
        if(strs == null || strs.Length == 0) return result;
        
        //overall TC: O(n(k logk + O(k))) //O(N(KLogK+O(K)))
        Dictionary<double, List<string>> map = new Dictionary<double, List<string>>();
        foreach(string str in strs){ // TC: n
            //char[] charArray = str.ToCharArray();
            //Array.Sort(charArray);
            //string sortedStr = new string(charArray); // TC: k log k

            double hash = getHash(str); //k
            if(!map.ContainsKey(hash)){
                map[hash] =  new List<string>();
                
            }

            map[hash].Add(str);
        }
         foreach (var entry in map.Values) {
            result.Add(entry);
        }

        return result;
    }

    private double getHash(string str){
        double hash = 1L;

        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

        foreach(char c in str){
            hash = hash * prime[c - 'a'];
        }

        return hash;
    }
}