// Time Complexity : O(N * k * logk) k is letters in N words
// Space Complexity : O(N)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No



// this algorithm of sorting passes leetcode. Another alorithm I tried with 
//kind of hashing, passes the initial test case of leetcode but doest get acceted.
// not sure whats wrong. 


var groupAnagrams = function(strs) {
    const result = new Map();
    
    for(let str of strs){
        //sort the array alphabetically
        const sorted = str.split('').sort().join('');
        if(result.has(sorted)){
            result.get(sorted).push(str)
        }else{
            result.set(sorted, [str]);
        }
    }
    return Array.from(result.values())
};

// Time Complexity : O(N * k)
// Space Complexity : O(N + 26)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// keep count of the characters according to charCode in the array
//check the existance of letters based on the assumption that there are no numbers or characters.

/*
var groupAnagrams = function(strs) {
    const result = new Map();
    for(let str of strs){
       const count = Array(26).fill(0);
        for(let i = 0; i < str.length; i++){
            count[str.charCodeAt(i) - 97] += 1;
        }
        const halfHash = count.join('')
        
        if(result.has(halfHash)){
            result.get(halfHash).push(str)
        }else{
            result.set(halfHash, [str]);
        }
    }
    return Array.from(halfHash.values())
};
*/


// Input
// ["bdddddddddd", "bbbbbbbbbbc"]
// Output
// [["bdddddddddd","bbbbbbbbbbc"]]
// Expected
// [["bbbbbbbbbbc"],["bdddddddddd"]]