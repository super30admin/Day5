// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
split by space
if no elements exist or length of pattern and words not same return false
map in normal and reverse order what each char corresponds to
if we find any key that comes with 2 values return false
else return true
*/

package main

import (
	"fmt"
	"strings"
)

func wordPattern(pattern string, s string) bool {
	splt := strings.Fields(s)
	if len(pattern) != len(splt) { return false }
	dic := make(map[byte]string)
	dicrev := make(map[string]byte)
	for i, _ := range splt {
		v1, e := dic[pattern[i]]
		if e {
			if v1 != splt[i] {
				return false
			}
		} else {
			dic[pattern[i]] = splt[i]
		}
		v2, e2 := dicrev[splt[i]]
		if e2 {
			if v2 != pattern[i] {
				return false
			}
		} else {
			dicrev[splt[i]] = pattern[i]
		}
	}
	return true
}

func MainWordPattern() {
	fmt.Println(wordPattern("abba", "dog cat cat dog")) //expected true
}
