Time Complexity-O(n)-No of words in the array
Space Complexity-O(1)

//Leetcode Submission-Successful

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {  
        List<List<String>> res=new ArrayList<>();
        HashMap<String,Integer> map=new HashMap<>();
        int toAddIndex=0;
        int listIndex;
        for(String s:strs)
        {
            char[] t=s.toCharArray();
            Arrays.sort(t);
            String temp=new String(t);
            if(!map.containsKey(temp))
            {
                map.put(temp,toAddIndex);
                res.add(new ArrayList<>());
                res.get(toAddIndex).add(s);
                toAddIndex++;
            }
            else{
                listIndex=map.get(temp);
                res.get(listIndex).add(s);
            }
            }
        
        return res;
   

}
}
