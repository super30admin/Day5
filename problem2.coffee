# Time Complexity : O(n) looping through each letter in input
# Space Complexity : O(n) creating a hashmap
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this :

# Approach:
# Have 2 hashmaps, one that maps from s => t and one that maps from t => s
# for each s', t' pair in s,t
#   if s' => t' doesn't exist
#     add an s' => t' mapping
#     if t' => <not s'> exists return error
#   else
#     if s' => <not t'> exists return error
#     else if t' => <not s'> exists return error
# return success

areIsomorphic = (s, t) ->
  return false if s.length != t.length

  smap = new Map()
  tmap = new Map()

  for i in [0...s.length]
    if !smap.has(s[i])
      smap.set(s[i], t[i])
      return false if tmap.has(t[i]) and tmap.get(t[i]) != s[i]
      tmap.set(t[i], s[i])
    else
      return false if smap.get(s[i]) != t[i]
      return false if tmap.has(t[i]) and tmap.get(t[i]) != s[i]
      tmap.set(t[i], s[i])

  true

