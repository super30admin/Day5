/**

Time Complexity - O(n*l) where n is the length of an input array and l is the max length of string inside the array.
Space Complexity - O(n) the size of a map and O(1) for array that is being used to generate a key. Overall O(n)

eat tea tan ate nat
O(n^2)
eat -> tea
Map String -> List<String>
O(nklogk)

generate hashcode out of eat -> hashstring.

25 characters 
0123456725

**/
class Solution {
    
    int count[] = new int[26];
    
    public List<List<String>> groupAnagrams(String[] strs) {
        
        if (strs == null || strs.length == 0)
        {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> keyToAnagrams = new HashMap<>();
        
        for (String s : strs)
        {
            String key = getKey(s);
            
            if (keyToAnagrams.containsKey(key))
            {
                keyToAnagrams.get(key).add(s);
            }
            else
            {
                final List<String> values = new ArrayList<>();
                values.add(s);
                keyToAnagrams.put(key, values);
            }
        }
        
        final List<List<String>> results = new ArrayList<>();
        
        for (List<String> value : keyToAnagrams.values())
        {
            results.add(value);
        }
        
        return results;
    }
    
    
    
    private String getKey(String s)
    {
        Arrays.fill(count, 0);
        
        for (int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            count[c - 'a']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int n : count)
        {
            sb.append('#');
            sb.append(n);
        }
        
        System.out.println(sb.toString());
        
        return sb.toString();
    }
}