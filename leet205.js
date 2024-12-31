/**
 *  Time Complexity - O(n^2)
 * Space complexity - O(1)
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
    var mp = new Map();
    for(let i in s){
       mp.set(s[i],t[i]);
    }
    for(let j in t){
        if(mp.get(s[j])!=t[j]){
            return false;
        }
    }
    return new Set([...mp.values()]).size==mp.size;
};
console.log(isIsomorphic("egg","add"));