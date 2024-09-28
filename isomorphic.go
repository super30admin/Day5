// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
map in normal and reverse order what each char corresponds to
if we find any key that comes with 2 values return false
else return true
*/
package main

import "fmt"

func isIsomorphic(s string, t string) bool {
	if len(s) != len(t) { return false }
	m := make([]byte, 150)
	mrev := make([]byte, 150)
	for i:= 0; i<len(s); i++ {
		if m[s[i] - 32] == 0 {
			m[s[i] - 32] = t[i]
		} else if m[s[i] - 32] != t[i]{
			return false
		}
		if mrev[t[i] - 32] == 0 {
			mrev[t[i] - 32] = s[i]
		} else if mrev[t[i] - 32] != s[i]{
			return false
		}
	}
	return true
}

func MainIsomorphic() {
	fmt.Println(isIsomorphic("add", "egg")) //expected true
}