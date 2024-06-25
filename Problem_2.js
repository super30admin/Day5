// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/**
 * In this problem, mapped the s[i] and the t[i] with each other. If s[i] exists in the map, then I check if the t[i] is same as what is in the map, else return false. 
 * If s[i] doesn't exist then add the first t[i] seen by the loop. Since we need to compare all the elements, the time complexity is O(n) 
 */
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {

    let charMap = {};

    if(s.length != t.length)
        return false

    for(let i=0; i<s.length; i++){
        if(!(s[i] in charMap) && Object.values(charMap).indexOf(t[i]) == -1)
            charMap[s[i]] = t[i];
        else if(charMap[s[i]] != t[i]){
            return false;
        }
    }
    return true
};