// Time Complexity : O(n.klogk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes (Problem: 49)
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

/**
 * @param {string[]} strs
 * @return {string[][]}
 */
 var groupAnagrams = function(strs) {
    let answerMap = new Map();
    
    strs.forEach((word) => {
        let sortedWord = word.split("").sort().join("");
        if (answerMap.has(sortedWord))
            answerMap.get(sortedWord).push(word)
        else
            answerMap.set(sortedWord, [word])
    });
    
    let result = []
    answerMap.forEach((value, key) => {
        result.push(value)
    })
    
    return result;
};