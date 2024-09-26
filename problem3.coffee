# Time Complexity : O(n) where n is length of pattern
# Space Complexity : O(n) creating 2 hashmaps of size O(n)
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this :
#  keeping the smap, s[] and pmap, p[] straight
#  i kept mixing up smap with s and pmap with p input

# Approach:
#  Same as problem 2, but have to split str on space character
#  I'll also split the pattern into a character array so abba => [a, b, b, a]
#  so I can map across both pattern and string

patternString = (pattern, str) ->
  p = pattern.split('')
  s = str.split(' ')

  return false if p.length != s.length

  pmap = new Map()
  smap = new Map()

  for i in [0...p.length]
    if pmap.has(p[i])
      return false if pmap.get(p[i]) != s[i]
    else
      pmap.set(p[i], s[i])

    if smap.has(s[i])
      return false if smap.get(s[i]) != p[i]
    else
      smap.set(s[i], p[i])

  true

patternString('abba', 'dog cat cat dog')
patternString('abba', 'dog cat cat dog')
patternString('abba', 'dog cat cat fish')
patternString('aaaa', 'dog cat cat fish')

