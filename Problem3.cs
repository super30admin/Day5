
//TC:O(N)
//SC:O(N)
public class Solution {
    public bool WordPattern(string pattern, string s) {
        Dictionary<char,string> st = new Dictionary<char,string>();
        HashSet<string> set = new HashSet<string>();
        string[] arr = s.Split(" ");
        if(pattern.Length != arr.Length){
            return false;
        }
        for(int i=0;i<pattern.Length;i++){
            if(st.ContainsKey(pattern[i])){
                if(st[pattern[i]]!=arr[i]){
                    return false;
                }
            }else{
                if(set.Contains(arr[i])){
                    return false;
                }
                st.Add(pattern[i],arr[i]);
                set.Add(arr[i]);
            }
        }
        
        return true;
    }
}