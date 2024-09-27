Time Complexity : O(n) as we need to traverse each string in string array.
Space Complexity : O(1) 
Ran on Leetcode : Yes
Approach : Sort the strings and maintain a Map. return the values.
**
 * @param {string[]} strs
 * @return {string[][]}
 */
 var groupAnagrams = function(strs) {
    var map={};
    for(let st of strs)
    {  
        var k = st.split('').sort().join('').toString();
        if(!map[k])
        {
            map[k]=[];
        }
        map[k].push(st);
    }
    return Object.values(map);
};
console.log(groupAnagrams(["eat","tea","tan","ate","nat","bat"]));