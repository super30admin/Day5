class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> word=new HashMap<>();
        HashMap<String,Character> wordtoPattern=new HashMap<>();
        String[] arr=str.split(" ");
        if(pattern.length()!=arr.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(word.containsKey(pattern.charAt(i)))
            {
                if(!word.get(pattern.charAt(i)).equals(arr[i]))
                    return false;
            }
            else
            {
                word.put(pattern.charAt(i),arr[i]);
            }
            if(wordtoPattern.containsKey(arr[i]))
            {
                if(!wordtoPattern.get(arr[i]).equals(pattern.charAt(i)))
                    return false;
            }
            else
            {
                wordtoPattern.put(arr[i],pattern.charAt(i));
            }
        }
        return true;
    }
}