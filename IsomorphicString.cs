//TC:O(N)
//SC:O(N)
public class Solution {
    public bool IsIsomorphic(string s, string t) {
        Dictionary<char,char> st = new Dictionary<char,char>();
        Dictionary<char,char> ts = new Dictionary<char,char>();
        
        for(int i=0;i<s.Length;i++){
            char sCh = s[i];
            char tCh = t[i];
            
            if(st.ContainsKey(sCh)){
                if(st[sCh]!=tCh){
                    return false;
                }
            }else{
                st.Add(sCh,tCh);
            }
            
             if(ts.ContainsKey(tCh)){
                if(ts[tCh]!=sCh){
                    return false;
                }
            }else{
                ts.Add(tCh,sCh);
            }
        }
        return true;
    }
}