// Approach : Maintain a hashmap to store which chars of s mapped to which chars of t. And we also need to verify reverse mapping from t to s to make sure this char in t is not already mapped to different char in s 
// Time Complexity : O(n), where n is the length of string s and t
// Space Complexity: O(1) since we can only have 256 mappings at maximum

public class Solution {
    public bool IsIsomorphic(string s, string t) {
        if(s.Length != t.Length)  return false;
        
        Dictionary<char, char> sMap = new Dictionary<char,char>();
        HashSet<char> tSet = new HashSet<char>();
        
        for(int i=0; i<s.Length; i++){
            
            if(sMap.ContainsKey(s[i])){
                if(sMap[s[i]] != t[i])
                    return false;
                
            } else{
                if(tSet.Contains(t[i]))
                    return false;
                
                sMap.Add(s[i], t[i]);
                tSet.Add(t[i]);
            }
        }
        
        return true;
    }
}