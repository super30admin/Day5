class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        HashMap<Character,String>map=new HashMap();
        HashMap<String,Character>map1=new HashMap();
        System.out.println(pattern.length());
        if(pattern.length()==0||
          str.length()==0)
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            String[] strArray=str.split(" ");
            if(pattern.length()!=strArray.length)
            {
                return false;
            }
            if(!map.containsKey(pattern.charAt(i)))
            {
                map.put(pattern.charAt(i),strArray[i]);
            }
            else{
                if(!map.get(pattern.charAt(i)).equals(strArray[i]))
                {
                    return false;
                }
            }
            if(!map1.containsKey(strArray[i]))
            {
                map1.put(strArray[i],pattern.charAt(i));
            }
            else{
                if(!map1.get(strArray[i]).equals(pattern.charAt(i)))
                {
                    return false;
                }
            }

        }
        return true;
    }
}
//Time Complexity- O(n)
//Space Complexity-O(n)