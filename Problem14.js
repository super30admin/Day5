// time complexity: O(nk log k)
// space complexity: O(nk)

/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    let h  = new Map();
    for(let i=0; i<strs.length; i++){
        let key = strs[i].split("").sort().join("");
        if(h.has(key)){
            h.get(key).push(strs[i])
        }else {
            h.set(key, [strs[i]])    
        }
    }
    let res = Array.from(h.values())
    return res;
};

