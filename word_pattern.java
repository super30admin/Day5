class Solution{
    public boolean wordPattern(String pattern, String s){
        if(pattern == null || pattern.length == 0) return false; // this is the base case where we check if the string dosent have any elements in it, we return false
        HashMap<Character, String> pMap = new HashMap<>(); // we create a hashMap with char and str as inputs and pMap as the name for storing the pattern.
        HashMap<String, Character> sMap = new HashMap<>(); // we create another hashMap with str and char s inputs and sMap as the name for storing the s.
        // we are given a string s which has different words. we have to take these words out and map then to a particular pattern.
        String[] strArray = s.split(" "); // this step will split the words and put them in an String array.
        if(pattern.length() != strArray.length()){ // if the length of the pattern is not equal to the length of strArray
            return false; // we return fasle becuase there is no possibility for the word pattern to match.
        }
        for(int i = 0; i < pattern.length(); i ++){ //this is the else case where we say that the pattern length and the strArray are equal. we go through the strings
            char c = pattern.charAt(i); // we get the char persent at i in the pattern and store it in the char array with name c.
            String str = strArray[i]; // we get the string present at i in the strArray and store it in the string array with name str.
            if(pMap.containsKey(c)){ // if the hashMap with name pMap already contains the char c
                if(!pMap.get(c).equals(str)){ // if pMap already contains the character c, we are getting the string associated with c and we are checking if that c is not equal to the current string str.
                    return false;
                }
            }
            else{
                pMap.put(c, str); // if pMap dosent contains the char c, we add it.
            }
            if(sMap.containsKey(str)){ // if the hashMap with name tMap already contains the string str
                if(!sMap.get(str).equals(str)){ // if tMap already contains the String str, we are getting the character associated with str and we are checking if that str is not equal to the current character c.
                    return false;
                }
            }
            else{
                tMap.put(str, c); // if tMap dosent contains the string str, we add it.
        }
    }
}
// TC AND SC - O(n);