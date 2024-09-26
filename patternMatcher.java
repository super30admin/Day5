/**

pattern = "abba", s = "dog cat cat dog"

Assumptions & clarifications 
- does it contain only lowercase letters?
- non empty strings

Solutions:
- "abba"
- "dog cat cat fish"

O(n^2) bruteforce apporoach
-(n-1)*(n-2)*(n-3) * (n-n) = O(n^2)

O(n) optimal approach
- Map -> character to String.
TC - O(n)+O(1)+O(n) = O(n)
SC - O(n) where n is the size of set.

TestCases:


**/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        final String split[] = s.split(" ");
        
        if (pattern.length() != split.length)
        {
            return false;
        }
        
        final Map<Character, String> characterToString = new HashMap<>();
        final Set<String> visitedString = new HashSet<>();
        
        for (int i=0; i<pattern.length(); i++)
        {
            char p = pattern.charAt(i);
            
            if (characterToString.containsKey(p))
            {
                if (!characterToString.get(p).equals(split[i]))
                {
                    return false;
                }
            }
            else
            {
                if (visitedString.contains(split[i]))
                {
                    return false;
                }
                
                characterToString.put(p, split[i]);
                visitedString.add(split[i]);
            }
            
        }
        return true;
    }
}