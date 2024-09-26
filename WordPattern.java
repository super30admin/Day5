//TC: O(N) we are checking every character if string s and then comparing with each word of String str
//SC: O(N) as we are using hashmap to check the mapping between the word is right or wrong.

class WordPattern {

    public boolean wordPattern(String s, String str) {

        String[] words = str.split(" ");
        if(s.length() != words.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        char[] c = s.toCharArray();

        for (int i = 0; i < s.length(); i++){
            boolean check = map.containsKey(s.charAt(i));
            if (check && (!map.get(s.charAt(i)).equals(words[i])) || !check && map.containsValue(words[i])){
                return false;
            }

            map.put(s.charAt(i),words[i]);
        }

        return true;
    }

}