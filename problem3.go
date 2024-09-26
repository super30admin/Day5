// Time Complexity : O(mk)+O(nk) where m is length of pattern, k is the avg size of word in "s" and n is the number of words in "s"
// Space Complexity : O(mk) - This is to store the splitted string in the string array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

func wordPattern(pattern string, s string) bool {
    mp := make(map[string]string)
    ms := make(map[string]string)
    
    st := strings.Split(s," ")
    
    if len(st) != len(pattern){
        return false
    }
    
    for i:=0;i<len(st);i++{
        pat := string(pattern[i])
        str := st[i]
        if _,ok := mp[pat];ok{
            if mp[pat] != str{
                return false
            }
        }else{
            mp[pat] = str
        } 
        
        if _,ok := ms[str];ok{
            if ms[str] != pat{
                return false
            }
        }else{
            ms[str] = pat
        } 
    }
    
    return true
}
