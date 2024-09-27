// Time Complexity : O(N * NLogN) - tc for sorting is nlogn. If we sort n times
// our complexity becomes n * NLogN
// Space Complexity : O(N + N) = O(N))
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

var groupAnagrams = function (strs) {
  if (strs.length === 1) {
    return [[strs[0]]];
  }
  const stringHash = {};
  const sortedStrs = strs.map((word) => word.split("").sort().join(""));

  for (i = 0; i < sortedStrs.length; i++) {
    if (!stringHash[sortedStrs[i]]) {
      stringHash[sortedStrs[i]] = [strs[i]];
    } else {
      stringHash[sortedStrs[i]].push(strs[i]);
    }
  }

  return Object.values(stringHash);
};

console.log(groupAnagrams([""]));
