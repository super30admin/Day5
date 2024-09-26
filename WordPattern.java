T:O(N)
S:O(N)
class Solution {
    public boolean wordPattern(String pattern, String s) {

        char[] pArray = pattern.toCharArray();
        String[] sArray = s.split(" ");

        if(pArray.length!=sArray.length)
            return false;

        HashMap<Character, Integer> pMap = new HashMap<>();
        HashMap<String, Integer> sMap = new HashMap<>();

        for(int i=0;i<pArray.length;i++){
            int pIndex = pMap.getOrDefault(pArray[i],-1);
            int sIndex = sMap.getOrDefault(sArray[i],-1);

            if(pIndex!=sIndex)
                return false;

            pMap.put(pArray[i],i);
            sMap.put(sArray[i],i);
        }

        return true;
    }
}