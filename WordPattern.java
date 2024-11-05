class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split("\\s+");
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        if(pattern.length() != str.length)
         return false;
        for(int i=0;i<pattern.length();i++){
            System.out.println(str[i]);
            if(!(map1.containsKey(pattern.charAt(i))))
               map1.put(pattern.charAt(i),str[i]);
            if(!(map2.containsKey(str[i])))
               map2.put(str[i],pattern.charAt(i));
            
            if(!((str[i].equals(map1.get(pattern.charAt(i)))) && (pattern.charAt(i)==map2.get(str[i]))))
                  return false;
            
        }
        return true;
    }
}