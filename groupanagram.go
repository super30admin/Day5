// Time Complexity : O(nk)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
if no elements exist return nil
find a unique ascii value for each string using primes
if key exists append string to that map value else create new entry
return final map
*/
package main

import "fmt"

func groupAnagrams(strs []string) [][]string {
	if strs == nil || len(strs) == 0 {
		return nil
	}

	ans := make(map[int64][]string)

	i := 0
	for i < len(strs) {
		key := findKey(strs[i])

		v, e := ans[key]
		if e {
			v = append(v, strs[i])
			ans[key] = v
		} else {
			x := []string{strs[i]}
			ans[key] = x
		}
		i++
	}
	v1 := make([][]string, 0, len(ans))
	for  _, value := range ans {
		v1 = append(v1, value)
	}
	return v1
}

func findKey(str string) int64 {
	primes := []int64{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101}
	var result int64
	result = 1
	for _, c := range str {
		result *= primes[c - 97]
	}
	return result
}

func MainGroupAnagram() {
	strs := []string{"eat","tea","tan","ate","nat","bat"}
	fmt.Println(groupAnagrams(strs)) // expected [["bat"],["nat","tan"],["ate","eat","tea"]]
}
