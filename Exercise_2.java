//Time complexity  - O(N)
//Space complexity - O(N)


class Solution {
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()) return false;

        Map<Character, Character> hmap1 = new HashMap<>();
        Map<Character, Character> hmap2 = new HashMap<>();

        for(int i=0; i< s.length(); i++) {

            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            /** check if the key for char c1 exists */
            if(hmap1.containsKey(c1)) {

                /** if char c2 does not match the mapped value of c1 */
                if(c2 != hmap1.get(c1)) {

                    return false;

                }

            }
            else {

                /** check if the key for char c2 exists*/
                if(hmap2.containsKey(c2)) {
                    return false;
                }

                /** put the chars inside maps if keys are not found */
                hmap1.put(c1,c2);

                hmap2.put(c2,c1);


            }

        }

        return true;




    }
}