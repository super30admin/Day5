// Time Complexity : O(nk)
// Space Complexity :O(n)
/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var primeNumbers = [2, 3, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103];
var primeProduct = function(s){
    var result = 1;
    for(let i =0; i < s.length; i++){
        result *= primeNumbers[s.charCodeAt(i) - 'a'.charCodeAt(0)];
    }
    return result;
}
var groupAnagrams = function(strs) {

    var map = {};
    for(let i = 0;i < strs.length ; i++){
        var pp = primeProduct(strs[i]);
        if(pp in map){
            map[pp].push(strs[i]);
        }else{
            map[pp] = [strs[i]];
        }
    }
     return Object.values(map);
};