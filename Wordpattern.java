class Solution {
    public boolean wordPattern(String pattern, String str) {
       HashMap<Character,String> hashMap=new HashMap<>();
       String[] arr=str.split(" ");
       if(pattern.length()!=arr.length) {return false;} 
       HashSet<String> hashSet=new HashSet<String>(); 
       for(int i=0;i<pattern.length();i++)
       {
           String curr=arr[i];
           if(hashSet.add(curr) && !hashMap.containsKey(pattern.charAt(i)))
           {
                hashMap.put(pattern.charAt(i),arr[i]);
           }   
       }
       for(int i=0;i<pattern.length();i++)
       {
           String word=hashMap.get(pattern.charAt(i));
           System.out.print(word);
           System.out.print(arr[i]);
           if(word==null || !word.equals(arr[i]))
           {
               return false;
           }
       }
        return true;
        
    }
}