// time complexity: O(n)
//space complexity: O(2n)

class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> stot = new HashMap<>();
        HashMap<Character,Character> ttos = new HashMap<>();

        for(int x = 0; x < s.length(); x++){

            char schar = s.charAt(x);
            char tchar = t.charAt(x);

            if(stot.containsKey(schar) && stot.get(schar) != tchar){
                return false;
            }
            else{
                stot.put(schar,tchar);
            }

            if(ttos.containsKey(tchar) && ttos.get(tchar) != schar){
                return false;
            }
            else{
                ttos.put(tchar,schar);
            }

        } return true;

    }
}