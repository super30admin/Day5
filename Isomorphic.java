class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2)
            return false;
        
        // HashMap<Character, Character> map1 = new HashMap<>();
        // HashMap<Character, Character> map2 = new HashMap<>();

        char[] arr1 = new char[100];
        char[] arr2 = new char[100];

        for(int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            //Create a mapping for str1->str2 , str2->str1
            //But if the key is already present in the map, then make sure it is mapped to same value always
            // if(map1.containsKey(ch1)) {

            //     //If char is mapped to a diff char then it fails
            //     if(map1.get(ch1) != ch2) {
            //         return false;
            //     }
            // }
            // else
            //     map1.put(ch1, ch2);

            // //Check the other way around
            // if(map2.containsKey(ch2)) {

            //     if(map2.get(ch2) != ch1) {
            //         return false;
            //     }
            // }
            // else
            //     map2.put(ch2, ch1);

            if(arr1[ch1 - ' '] == 0) {
                
                arr1[ch1 - ' '] = ch2;
            }
            else {

                if(arr1[ch1 - ' '] != ch2) {
                    return false;
                }
            }

            if(arr2[ch2 - ' '] == 0) {
                
                arr2[ch2 - ' '] = ch1;
            }
            else {

                if(arr2[ch2 - ' '] != ch1) {
                    return false;
                }
            }
        }

        return true;
    }
}