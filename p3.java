// time complexity: O(n)
//space complexity: O(2n)


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strtoarr = s.split(" ");

        HashMap<Character,String> chartostr = new HashMap<>();
        HashMap<String,Character> strtochar = new HashMap<>();

        for(int x = 0; x < s.length(); x++){

            char patternchar = pattern.charAt(x);
            String schar = strtoarr[x];

            if(chartostr.containsKey(patternchar) && chartostr.get(patternchar) != schar){
                return false;
            }
            else{
                chartostr.put(patternchar,schar);
            }


            if(strtochar.containsKey(schar) && strtochar.get(schar) != patternchar){
                return false;
            }
            else{
                strtochar.put(schar,patternchar);
            }

        } return true;


    }
}