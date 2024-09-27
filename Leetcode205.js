// Time Complexity : O(n), we need to traverse the input from 0 till end of length of string, even though map contant is O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
   if(s.length!==t.length)
        {return false;}
    var map = new Map();
    for(let i=0;i<s.length;i++)
    {
        if(!map.has(s[i]))
        {
           map.set(s[i],t[i]);
        }
        else
        {
            if(map.get(s[i])!==(t[i])){
                return false;
            }
        }
    }
    return new Set([...map.values()]).size===map.size;
};