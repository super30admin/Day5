// If we have n strings in strs and max length of each is k,
// Time Complexity : O(nk) we go over n strings and calculate hash for string length k 
// Space Complexity: O(nk) worst case the hashmap has n keys each of size k
public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        Dictionary<string, IList<string>> map = new Dictionary<string, IList<string>>();
        
        foreach(string str in strs){
            string hash = CalculateHash(str);
            
            if(!map.ContainsKey(hash))
                map.Add(hash, new List<string>());
            
            map[hash].Add(str);
        }
        
        var ans = new List<IList<string>>();
        ans.AddRange(map.Values);
        
        return ans;
    }
    
    string CalculateHash(string str){
        int[] count = new int[26];
        
        for(int i=0; i<str.Length; i++){
            count[str[i]-'a']++;
        }
        
        StringBuilder s = new StringBuilder();
        for(int i=0; i<26; i++){
            s.Append("#");
            s.Append(count[i]);
        }
        
        return s.ToString();
    }
}