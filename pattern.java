/*
  Time complexity - O(n)
  Space complexity -O(n) for hash map
  Leetcode - yes
  check if the words size in  s and char sizes in pattern are same if not return false
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []arr=s.split(" ");
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        //check the size
        if(arr.length!=pattern.length())
            return false;
        //iterate to check if it is present in map if yes check value if it is not present inmap check in the set if it is not present in the set insert
        for(int i=0;i<arr.length;i++){
            char temp = pattern.charAt(i);
            if(map.containsKey(temp)){
                if(!map.get(temp).equals(arr[i])) return false;
                
            }
            else if(set.contains(arr[i])) return false;
            else{
                set.add(arr[i]);
                map.put(temp,arr[i]);
            }
        }
        
        return true;
    }
}