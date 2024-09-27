// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
/*Approach : here, we have taken two hashmap where all of the (key,value) pairs in one hashmap exactly
resembles all(value,key)pair in another following One-to-one correspondence fashion.
*/
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> pmap=new HashMap<>();
         HashMap<String,Character> smap=new HashMap<>();
          String[] st=s.split(" ");
        if(pattern.length()!=st.length){

            return false;

        }
        char[] ch=pattern.toCharArray();
        for(int i=0;i<pattern.length();i++){
             char pc=ch[i];
             String str=st[i];
            if(pmap.containsKey(pc)&&smap.containsKey(str))
            {
                if(pmap.get(pc).equals(str) && smap.get(str)==pc)
                    continue;
                else{
                    System.out.println(pmap.get(pc));
                    System.out.println(str);
                    return false;
                }
            }
            else if(!pmap.containsKey(pc)&&!smap.containsKey(str)){
                pmap.put(pc,str);
                smap.put(str,pc);
            }
            else{

                return false;

            }
        }
        return true;
    }
}