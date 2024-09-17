time complexity: O(n)
space complexity: O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        
       // Two strings cannot be isomorphic if they have different lengths.
		if (s.length() != t.length()) {
			return false;
		}
  
  	// creating a hashmap
		Map<Character, Character> map = new HashMap<>();

  	// Using a set to keep track of already mapped characters.
		Set<Character> set = new HashSet<>();

		for (int i = 0; i < s.length(); i++)
		{
			char c1 = s.charAt(i), c2 = t.charAt(i);

  		// If c1 has been encountered before:
			if (map.containsKey(c1))
			{
        // Return false if first occurrence of c1 is mapped to a different character.
				if (map.get(c1) != c2)
					return false;
			}
  		// If c1 is encountered for the first time, it has not been mapped yet:
			else
			{
  			// Return false if c2 is already mapped to some other char in s
				if (set.contains(c2))
					return false;

  			// All checks passed. So insert in the map, and the set.
				map.put(c1, c2);
				set.add(c2);
			}
		}
		return true;
	} 
    }