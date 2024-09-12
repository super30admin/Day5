//Time Complexity : O(N) for all operations 
//Space Complexity : O(N) for the length of string that we are storing in an array
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern.length()==0 || str.length()==0 || pattern == null || str== null) return false;

        String[] arr= str.split(" ");
        if(pattern.length()!= arr.length) return false;

        Map<Character, String> mapS = new HashMap<Character, String>();
        Map<String, Character> mapT = new HashMap<String, Character>();

        for(int i=0; i<pattern.length();i++)
        {
            char a = pattern.charAt(i);
            String b = arr[i];
            
            if(!mapS.containsKey(a))// Check if character/Key a is already present in sHash Map or not
            {
                mapS.put(a,b);// If no, then put the key and value in the hashmap sHash
            }
            else
            {
                if(!mapS.get(a).equals(b)) return false;// If it is present than match the value against that key with the character b.
            }
            if(!mapT.containsKey(b))// Check if character/Key b is already present in dHash Map or not
            {
                mapT.put(b,a);// If no, then put the key and value in the hashmap dHash
            }
            else
            {
                if(!mapT.get(b).equals(a)) return false;// If it is present than match the value against that key with the character a.
            }
                
        }
        return true;
    }
}