//Time complexity is O(N), N is pattern length
//Space complexity is O(N)
//Able to submit the code in leetcode

class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map1 = new HashMap<Character, String>();
        Map<String, Character> map2 = new HashMap<String, Character>();
        String[] strArr = s.split(" ");
        //If pattern length and number of words in given s are not equal, return false as it directly indicating that notfollowing pattern
        if(strArr.length!=pattern.length())
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(map1.containsKey(pattern.charAt(i))){
                System.out.println(map1.get(pattern.charAt(i)));
                System.out.println(strArr[i]);
                if(!map1.get(pattern.charAt(i)).equals(strArr[i])){
                    return false;
                }
            }
            else{
                map1.put(pattern.charAt(i), strArr[i]);
            }
            if(map2.containsKey(strArr[i])){
                System.out.println(map2.get(strArr[i]));
                System.out.println(pattern.charAt(i));
                if(!map2.get(strArr[i]).equals(pattern.charAt(i))){
                    return false;
                }
            }
            else
            {
                map2.put(strArr[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
