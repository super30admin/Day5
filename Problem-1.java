class Solution {
    //Method 1
    // Time Complexity : O(NK) where n is the size of the words array and K - maximum size of the word in words array
    // Space Complexity : O(NK) 
    // Did this code successfully run on Leetcode : Yes
    // Any problem you faced while coding this : Nope 
    /*
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0)
            return new ArrayList<>();
        Map<String,List> map = new HashMap<>();
        for (String s: strs) {
           int[] count = new int[26];
            for(char c: s.toCharArray()) {
                count[c-'a']++;
            }
            //Create a custom hash function containing the character and the count and put it to hashmap to store the key list combinations
            StringBuilder sb = new StringBuilder();
            for(int i = 0;i<26;i++) {
                if(count[i]!=0) {
                    
                    sb.append('a' + i );
                    sb.append(count[i]);
                    sb.append("#");
                    }
            }
            String key = sb.toString();
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(s);
        }
        return new ArrayList(map.values()); 
    }
    */
   
    
        //Method 2
    
        // Time Complexity : O(NKlogK) where n is the size of the words array and KlogK - maximum size of the word in words array
        // Space Complexity : O(NK) 
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : Nope 
    
        public List<List<String>> groupAnagrams(String[] strs) {
            if(strs == null || strs.length == 0)
                return new ArrayList();
            Map<String,List> map = new HashMap<>();
            for(String s: strs) {
                char[] c = s.toCharArray();
                //group of anagrams when sorted gives the same key and use HashMap to storee the key list combinations
                Arrays.sort(c);
                String sorted = new String(c);
                map.putIfAbsent(sorted,new ArrayList<>());
                map.get(sorted).add(s);
        }
            return new ArrayList(map.values());
        }
}
