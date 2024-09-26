// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


class Solution {
    public boolean wordPattern(String pattern, String str) {
        if(pattern == null || pattern.length() == 0 || str == null || str.length() == 0)
            return false;

        //Split the string into an array for comparison
        String[] words = str.split(" ");

        if(words.length!= pattern.length())
            return false;

        //Maintain two hashmaps to see if they are isomorphic to each other
        HashMap<Character,String> hm1 = new HashMap<>();
        HashMap<String,Character> hm2 = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char a = pattern.charAt(i);
            String b = words[i];

            //contains mapping from character to string
            if(!hm1.containsKey(a))
                hm1.put(a,b);
            else{
                //System.out.println("hm1"+hm1);
                if(!hm1.get(a).equals(b))
                    return false;
            }

            //contains mapping from string to character
            if(!hm2.containsKey(b))
                hm2.put(b,a);
            else{
                //System.out.println("hm2"+hm2);

                if(!hm2.get(b).equals(a))
                    return false;
            }

        }
        return true;
    }
}