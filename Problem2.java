//time - O(n)
//space O(1)

//hashtable for s and t. check both ways
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] hashTableTFromSAscii = new int[128];
        int[] hashTableSFromTAscii = new int[128];
        
        Arrays.fill(hashTableTFromSAscii, -1);
        Arrays.fill(hashTableSFromTAscii, -1);
        
        if(s.length() != t.length()) return false;
        
        for(int i=0; i<s.length(); i++) {
            int sAscii = (int) s.charAt(i);
            int tAscii = (int) t.charAt(i);
            
            if(hashTableTFromSAscii[sAscii] == -1) {
                hashTableTFromSAscii[sAscii] = tAscii;
            } else {
                if(hashTableTFromSAscii[sAscii] != tAscii)
                    return false;
            }
        }
        
        for(int i=0; i<s.length(); i++) {
            int sAscii = (int) s.charAt(i);
            int tAscii = (int) t.charAt(i);
            
            if(hashTableSFromTAscii[tAscii] == -1) {
                hashTableSFromTAscii[tAscii] = sAscii;
            } else {
                if(hashTableSFromTAscii[tAscii] != sAscii)
                    return false;
            }
        }
        return true; 
    }
}