// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach in three sentences only
/**
 * In this problem, mapped the pattern[i] and the s[i] with each other. If patter[i] exists in the map, then I check if the s[i] is same as what is in the map, else return false. 
 * If pattern[i] doesn't exist then add the first s[i] seen by the loop. Since we need to compare all the elements, the time complexity is O(n) 
 */
/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
    let charMap = {};
    let sArr = s.split(" ");
    if(pattern.length != sArr.length)
        return false;

    for(let i=0; i<pattern.length; i++){
        if(!(pattern[i] in charMap) && Object.values(charMap).indexOf(sArr[i]) == -1)
            charMap[pattern[i]] = sArr[i];
        else if(charMap[pattern[i]] != sArr[i]){
            return false;
        }
    }
    return true
};