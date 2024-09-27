class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split("\\s+");
        
        if(pattern.length() != arr.length)
            return false;
        
        HashMap<Character, String> h1 = new HashMap<>();
        HashMap<String, Character> h2 = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            if(h1.containsKey(pattern.charAt(i))){
                if(!h1.get(pattern.charAt(i)).equals(arr[i]))
                    return false;
            }
            if(h2.containsKey(arr[i])){
                if(!h2.get(arr[i]).equals(pattern.charAt(i)))
                    return false;
            }
            
            h1.put(pattern.charAt(i), arr[i]);
            h2.put(arr[i], pattern.charAt(i));
        }
        
        return true;
    }
}

//Time complexity : O(N) where N is the length of pattern
//Space complexity : O(S+L) where S is the number of distinct characters to be stored in the hashmap and L is the number of strings after doing split.
