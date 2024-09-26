// Time Complexity : O(n) : to navigate the array + O(k log k) to sort K length of strings
//Hence it is O(nklogk)
// Space Complexity : O(nk)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
Algorithm :
Create a sorted array of the strings.
Now map each of the unique one as key and corresponding index in strs as value

Return the values.
**/

/**
 * @param {string[]} strs
 * @return {string[][]}
 */
const groupAnagrams = strs => {
	const map = {};
	for (let str of strs) {
		
		//sort the strings
		const sorted = str.split('').sort().join('');
		
		//map sorted string as key and given corresponding strig as value
		map[sorted] !== undefined ? map[sorted].push(str) : map[sorted] = [str];
	}
	  return Object.values(map);
  };