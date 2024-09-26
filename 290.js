// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
Algorithm : 
Bijection between a character to a word
            
**/

/**
 * @param {string} pattern
 * @param {string} str
 * @return {boolean}
 */
var wordPattern = function(pattern, str) {
    var pArr = pattern.split("");
    var sArr = str.split(" ");
    if (pArr.length !== sArr.length) return false;
    var mapP2S = {}
    var mapS2P = {}
    for (var i = 0; i < pArr.length; ++i) {
        if (pArr[i] in mapP2S) {
            if (sArr[i] !== mapP2S[pArr[i]]) return false;
        }
        else {
            mapP2S[pArr[i]] = sArr[i];
        }
        if (sArr[i] in mapS2P) {
            if (pArr[i] !== mapS2P[sArr[i]]) return false;
        }
        else {
            mapS2P[sArr[i]] = pArr[i];
        }
    }
    return true;
};