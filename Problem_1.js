// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let anagram = {};
    let collisionPrime = {a: 2, b: 3, c:  5, d: 7, e: 11, f:13, g:17, h:19, i:23, j:29, k:31, l:37, m:41, n:43, o:47,p: 53, q:59, r:61, s:67, t:71, u:73, v:79, w:83, x:89, y:97, z: 101}
    for(let i=0; i<strs.length; i++){
        let mul = 1;
        for(let j=0; j<strs[i].length; j++){
            mul*= collisionPrime[strs[i][j]];
        }
        if(!(mul in anagram))
            anagram[mul] = [strs[i]];
        else {
            anagram[mul].push(strs[i])
        }
    }
    return Object.values(anagram);
};