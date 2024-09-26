//T: O(N)
//S: O(N)
class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            int sIndex = sMap.getOrDefault(s.charAt(i),-1);
            int tIndex = tMap.getOrDefault(t.charAt(i),-1);

            if(sIndex!=tIndex){
                return false;
            }

            sMap.put(s.charAt(i),i);
            tMap.put(t.charAt(i),i);
        }

        return true;
    }
}