
public class GroupAnagrams {

    int [] a= {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
   
   public int hash(String word){
       
       int p=0;
       int prod=1;
       while(p<word.length()){
           
           int index = (int)word.charAt(p) - 96;
           prod=prod*a[index];
           
           //System.out.println(prod);
           p++;
       }
       
       return prod;
   }
   
   public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<Integer,List<String>> hm= new HashMap<>();
       
       for( int i=0;i<strs.length;i++){
           int hsh=hash(strs[i]);
           System.out.println(hsh);
           if(hm.containsKey(hsh)){
            hm.get(hsh).add(strs[i]);   
           
           }else{
               
               List <String>l= new LinkedList<>();
               l.add(strs[i]);
               hm.put(hsh,l);
           }
       }
       
       List<List<String>> ans=new LinkedList<>();
       for(int x: hm.keySet()){
           
          ans.add(hm.get(x));
       }
    return ans;   
   }
}
