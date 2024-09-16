class Solution {
    public boolean wordPattern(String pattern, String s) {
        int[] m = new int[256]; //total number of ASCII Characters in java
        HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }
        Arrays.fill(m,0);
        for(int i = 0; i < pattern.length(); i++){
            if(m[pattern.charAt(i)] !=  wordCounter.getOrDefault(words[i],0)){
                return false;
            }
            wordCounter.put(words[i], i+1);
            m[pattern.charAt(i)] = i+1;
        }
        return true;
    }
}

//run time complexity - O(n)
//Space time complexity - O(1)