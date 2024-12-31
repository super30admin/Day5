/**
 * Time Complexity - O(n)
* Space complexity - O(1)
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
    var map={};
    for(let st of strs){
       var str = st.split('').sort().join('');
       if(!map[str]){
        map[str]=[];
        map[str].push(st);
       }else{
        map[str].push(st);
       }
    }
    return Object.values(map).sort((a,b)=>a-b);
};
console.log(groupAnagrams(["eat","tea","tan","ate","nat","bat"]));