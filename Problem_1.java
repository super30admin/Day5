// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,ArrayList<String>> hash=new  HashMap<String,ArrayList<String>>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            if(hash.containsKey(new String(ch))){
                hash.get(new String(ch)).add(strs[i]);
            }else{
                ArrayList<String> arr=new ArrayList<String>();
                arr.add(strs[i]);
                hash.put(new String(ch),arr);
            }
        }
        //System.out.println(hash);
        for(List<String> li:hash.values()){
            list.add(li);
           // System.out.println(li);
        }
        return list;
    }
}