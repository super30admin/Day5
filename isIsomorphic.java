class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int[] map = new int[127];
        
        int[] status = new int[127];
        for( int i = 0; i <= 126; ++i){
            map[i] = -1;
            status[i] = -1;
            //initially no mappings
        }
        if(s.length() != t.length()){
            return false;
        }
        for( int i = 0; i < s.length(); ++i){
            if(map[s.charAt(i)-' '] == -1){
                if(status[t.charAt(i) -' '] == -1)
                {
                    map[s.charAt(i)-' '] = (t.charAt(i) - ' ');
                    status[t.charAt(i)-' '] = 1;
                }
                else
                    return false;
            }
            else{
                
                if(map[s.charAt(i)-' '] !=  (t.charAt(i) -' '))
                    return false;
            
            }
           
        }    
        return true;
    }
}

/*
Time Complexity:
O(n) size of target string
Space Complexity:
O(2*127) = Constant space
*/
