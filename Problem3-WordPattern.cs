// Time Complexity: O(nk) where n is the length of pattern, k is the max length of substring in s
// Spcae Complexity: O(nk)
public class Solution {
    public bool WordPattern(string pattern, string s) {
        string[] sArr = s.Split(' '); 
        
        if(pattern.Length != sArr.Length) return false;
        
        Dictionary<char, string> map = new Dictionary<char, string>();
        HashSet<string> sSet = new HashSet<string>();
        
        for(int i=0; i<pattern.Length; i++){
            if(map.ContainsKey(pattern[i])){
                if(map[pattern[i]] != sArr[i])
                    return false;
            }else{
                if(sSet.Contains(sArr[i]))
                    return false;
                
                map.Add(pattern[i], sArr[i]);
                sSet.Add(sArr[i]);
            }
        }
        
        return true;
    }
}