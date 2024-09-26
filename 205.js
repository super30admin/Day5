// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
Algorithm : Using hash map mapping

 We create a map to store the characters in s as the key and the characters in t as the values
 a unique key is seen,we check if the value already exists in the map if it does, we return false. 
 If the value doesn't exists in the map then we add them into the map. 
 
 If a key that isn't unique is seen, we get the value of the key and compare it with
the corresponding s.charAt(i), 
If they are not thesame,we return false;
            
**/


/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */

function isIsomorphic(s, t) {
    if (s.length !== t.length) {
        return false;
    }
    const sMap = {}, tMap = {};
    for (let i = 0; i < s.length; i++) {
        if (sMap[s[i]] != tMap[t[i]]) {
            return false;
        }
        sMap[s[i]] = i;
        tMap[t[i]] = i;
    }
    return true;
}