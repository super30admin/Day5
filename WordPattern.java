//Time Complexity: O(N)
//Space Complexity: O(K) number of strings present in String s
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> s1 = new HashMap<>();
        HashMap<String, Character> s2 = new HashMap<>();

        String[] s3 = s.split(" ");
        if(s3.length == pattern.length()){
            for(int i = 0; i < pattern.length(); i++){

                char charS = pattern.charAt(i);

                if(s1.containsKey(charS) && !s1.get(charS).equals(s3[i])) return false;

                else s1.put(charS, s3[i]);

                if(s2.containsKey(s3[i]) && !s2.get(s3[i]).equals(charS)) return false;

                else s2.put(s3[i], charS);
            }return true;

        }else return false;
    }
}