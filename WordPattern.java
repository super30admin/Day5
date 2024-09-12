class WordPattern {

    // Time Complexity: O(n)    (where n -> length of pattern)
    // Space Complexity: O(n)

    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length)
            return false;
        for(int i = 0; i < pattern.length(); i++){
            char curr = pattern.charAt(i);
            if(!map.containsKey(curr)){
                if(!map.containsValue(arr[i]))
                    map.put(curr, arr[i]);
                else
                    return false;
            }
            else{
                if(!map.get(curr).equals(arr[i]))
                    return false;
            }
        }
        return true;
    }
}