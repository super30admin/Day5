# Time Complexity : O()
# Space Complexity : O()
# Did this code successfully run on Leetcode : NA
# Any problem you faced while coding this :

# Approach:
# for each string in input
#   generate a unique mapping (letters a-z map to the first 26 primary numbers, multiply the letter numbers to get a unique number)
#   add an entry hashmap[unique mapping] = [any existing strings].push(string)
#
# now you have a hashmap like
#   { 73: [ate, eat, tea], 966: [nat, tan], etc}
#   output should be [[ate, eat, tea], [nat, tan]] which are the values so
#   return hashmap.map((key, value) => value) will return the results as an array of arrays

groupAnagrams = (inputs) ->
  primeArray = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
  # map a-z into primeArray via character.charCodeAt() - 'a'.charCodeAt()
  # 'a' => 0, 'b' => 1, ..., 'z' => 103

  hashmap = inputs.reduce(
    ((acc, input) ->
      aCharCodeAt = 'a'.charCodeAt()
      mapping = input.split('').reduce(
        ((acc, char) ->
          acc *= primeArray[char.charCodeAt() - aCharCodeAt]
        ), 1)
      if not acc.has(mapping)
        acc.set(mapping, [])
      acc.set(mapping, [acc.get(mapping)..., input])
    ), new Map())

  Array.from(hashmap.keys()).map (k) -> hashmap.get(k)

groupAnagrams(['eat', 'tea', 'tan', 'ate', 'nat', 'bat'])
