//Leet Code Passed
//Time Complexity- O(n)
/*
Runtime: 1 ms, faster than 99.52% of Java online submissions for Word Pattern.
Memory Usage: 34.2 MB, less than 97.30% of Java online submissions for Word Pattern.
*/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<Character, String>();
        char[] patArr = pattern.toCharArray();
        String[] strArr = str.split(" ");
        if(patArr.length==strArr.length){
        for(int i=0; i<strArr.length; i++){
            if((!map.containsKey(patArr[i]))&&(!map.containsValue(strArr[i]))){
            map.put(patArr[i],strArr[i]);
            }
            else{
                if(map.containsValue(strArr[i])) if(!map.containsKey(patArr[i])) return false;
                if(!strArr[i].equals(map.get(patArr[i]))) return false;
            }
        }
            return true;
    }
        else return false;       
    }
}