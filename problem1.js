// ## Problem 1:

// Given an array of strings, group anagrams together.

// Example:
// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]

// Note:
// All inputs will be in lowercase.
// The order of your output does not matter.

// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

let numArr = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151];

function calculateRes(str) {
    let res = 1;
    for(let char of str) {
        let num = numArr[char.charCodeAt(0) - 'a'.charCodeAt(0)];
        res *= num;
    }
    return res;
}

const groupAnagrams = function(strs) {
    let result = [];
    let map = new Map();
    for(let str of strs) {
        let ind = calculateRes(str);
        if(map.has(ind)) map.get(ind).push(str)
        else map.set(ind, [str]);
    }
    for (let [k,v] of map) {
        result.push(v);
    }
    return result;
};

//////////////////////////////////////////////

// Time Complexity : O(n klog(k))
// Space Complexity : O(m k)
// Did this code successfully run on Leetcode : Yes

const groupAnagrams = function(strs) { 
    const map = new Map();
    let res = [];
    for (let str of strs) {
        const key = str.split('').sort().join('');
        if (!map.has(key)) map.set(key, [])
        map.get(key).push(str);
    }
    for(let [k,v] of map) {
        res.push(v);
    }
    return res;
};
