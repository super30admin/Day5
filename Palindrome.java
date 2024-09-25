class Solution {
    public int longestPalindrome(String s) {
        if(s==null || s.length()==0)return -1;
        HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        boolean flag=false;
        
        for(char c: s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
            
        }
        for(char c: map.keySet()){
            int freq=map.get(c);
            if(freq%2==0){
                count=count+freq;
            }else{
                count=count+freq-1;
                flag=true;
            }
        }
        if(flag) return count+1;
        return count;
    }
}