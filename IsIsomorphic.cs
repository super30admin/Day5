// Time Complexity : O(n), we need to traverse the input from 1 to n, even though hash lookup is contant O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//https://leetcode.com/problems/isomorphic-strings/submissions/
//one hashmap and 1 hash set
 public bool IsIsomorphic(string s, string t) {
        
        if(string.IsNullOrEmpty(s) || string.IsNullOrEmpty(t) || s.Length != t.Length)
            return false;
        
        Dictionary<char, char> map = new Dictionary<char, char>();
        HashSet<char> set = new HashSet<char>();
        
        //iterate thru length of strign s or t, both should be of same length
        for(int i = 0; i < s.Length; i++)
        {
            char sChar = s[i];
            char tChar = t[i];
            
            //add keyvalye - s[i]/t[i[]] to hashmap, if doesnt exist
            if(!map.ContainsKey(sChar))
            {
                map.Add(sChar, tChar);
                //if hashset already contains tchar, then return false
                //it means, we already have that value with different key.
                if(!set.Contains(tChar))
                    set.Add(tChar);
                else
                    return false;
           } //s[i] key exists in hasmap, check if t[i] is the value in hashmap
            //if not it means we got new value for same key, we need to return false
            else if(map[sChar] != tChar)
                return false;
        }
        return true;
    }

// Time Complexity : O(n), we need to traverse the input from 1 to n, even though hash lookup is contant O(1)
// Space Complexity : O(1) (constant size 100 used)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//one hash set
    public bool IsIsomorphic(string s, string t) {
        
        if(string.IsNullOrEmpty(s) || string.IsNullOrEmpty(t) || s.Length != t.Length)
            return false;
        
        char[] sSet = new char[100];        
        char[] tSet = new char[100];        
        //iterate thru length of strign s or t, both should be of same length
        for(int i = 0; i < s.Length; i++)
        {
            char sChar = s[i];
            char tChar = t[i];
            
            //if schar -32 is not present, then add it
            if(sSet[sChar - ' '] == 0)
                sSet[sChar - ' '] = tChar;
            else // if char -32 is present, then compare with tchar, if its not same, then it means its new combination, return false
            {
                if(sSet[sChar - ' '] != tChar)
                    return false;
            }

            //if tchar -32 is not present, then add it
            if(tSet[tChar - ' '] == 0)
                tSet[tChar - ' '] = sChar;
            else // if char -32 is present, then compare with schar, if its not same, then it means its new combination, return false
                if(tSet[tChar - ' '] != sChar)
                    return false;
        }
        return true;
    }