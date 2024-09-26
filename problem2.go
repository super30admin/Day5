// Time Complexity : o(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

func isIsomorphic(s string, t string) bool {
    ms := make(map[string]string,len(s))
    mt := make(map[string]string,len(s))
    
    for i:=0;i<len(s);i++{
        sc := string(s[i])
        tc := string(t[i])
        
        if _,ok := ms[sc];ok{
            if ms[sc] != tc{
                return false
            }
        }else{
            ms[sc] = tc
        }
        
        if _,ok := mt[tc];ok{
            if mt[tc] != sc{
                return false
            }
        }else{
            mt[tc] = sc
        }
    }
            
    return true
    
}
