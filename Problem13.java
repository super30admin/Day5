public class Solution{
 public boolean isomorphicStrings(String str1, String str2) {
         char[] str1Arr = str1.toCharArray();
         String[] str2Arr = str2.split(" ");
         if(str1Arr.length!=str2Arr.length) return false;
         
         HashMap<Character,String> map= new HashMap<Character,String>();
         for(int i=0; i< str1Arr.length;i++){
             char c1 = str1Arr[i];
             String s = str2Arr[i];
             if(map.keySet().contains(c1)){
                 if(!map.get(c1).equals(s)) return false;         
             }else{
                 map.put(c1,s);
             }
          }
          return true;
    }
}
