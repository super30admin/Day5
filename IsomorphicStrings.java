//TC: O(N) this is because we are iterating each and every characters
//SC: O(1) this is because we are traversing array of constant size;

//Thought process:
/*
Give correspoding array of each strings an value and then compare if the values are matching in order
 */
class IsmorphicStrings{

    public boolean isIsomorphic(String s, String t) {
        if (s == null || t == null || s.length()!=t.length()){
            return false;
        }

        int[] sArray = new int[256];
        int[] tArray = new int[256];

        for (int i = 0; i < s.length(); i++){
            char s_c = s.charAt(i);
            char t_c = t.charAt(i);

            if (sArray[s_c] != tArray[t_c]){
                return false;
            }

            sArray[s_c] = i+1;
            tArray[t_c] = i+1;
        }

        return true;
    }
}