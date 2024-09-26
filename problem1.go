// Time Complexity : o(nklogk) where n is the number of elements in strs and k is the avg length of words. 
//                   Thus klogk to sort the string multiplied by number of elements in strs i.e. n
// Space Complexity : O(n) - If every word is uniques so the map will store every word as unique key
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Had to debug over the conversion issue with the string to rune/int32 in Golang during sort.Slice

//Approach 1
func groupAnagrams(strs []string) [][]string {
    if len(strs) == 0{
        return [][]string{}
    }
    
    m := make(map[string][]string)
    result := [][]string{}
    
    for _,val := range(strs){
        sorted := []rune(val)
        sort.Slice(sorted, func(i int, j int) bool { return sorted[i] < sorted[j] })
        m[string(sorted)] = append(m[string(sorted)],val)
    }
    
    for _,value := range(m){
        result = append(result,value)
    }
    
    return result
}


//Approach 2

func groupAnagrams(strs []string) [][]string {
    if len(strs) == 0{
        return [][]string{}
    }
    
    m := make(map[[26]int][]string)
    result := [][]string{}
   
    for _,val := range(strs){
        key := [26]int{}
        for _,value := range val{
            key[value-'a']++   
        }

        m[key] = append(m[key],val)
    }
 
    for _,value := range(m){
        result = append(result,value)
    }
    return result
}

