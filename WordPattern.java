// Time Complexity : O(N) where N is the length of pattern
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no



class WordPattern
{
    public boolean wordPattern(String pattern, String s)
    {
        String[] input = s.split(" ");

        if(pattern.length() != input.length) return false;

        int len = pattern.length();

        int count = 0;

        HashMap<Character, String> charToString = new HashMap<>();

        HashMap<String, Character> stringToChar = new HashMap<>();

        while(count < len)
        {
            char ch = pattern.charAt(count);
            String st = input[count];

            if(charToString.containsKey(ch)){
                if(!charToString.get(ch).equals(st)){
                    return false;
                }
            }
            else{
                if(stringToChar.containsKey(st)) return false;

                charToString.put(ch, st);

                stringToChar.put(st, ch);
            }

            count++;
        }
        return true;
    }
}
