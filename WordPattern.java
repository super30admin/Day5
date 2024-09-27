class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
       // pattern="abba" ;
        //s= "dog cat cat dog" ;
        
        HashMap<Character,String> hmap=new HashMap<>();
         HashMap<String,Character> hmap2=new HashMap<>();
         String [] x=s.split(" ");
        if(pattern.length ()!=x.length)
        {
            return false;
        }
        for (int i=0;i< pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            System.out.println("ch at "+ i  + ch);
            System.out.println("String at " + i +x[i]);
                  
        if (hmap.containsKey(ch) && (!hmap.get(ch).equals(x[i])) )
        {
            return false;
        }
        else
        {
            hmap.put(ch,x[i]);
        }
            
        if(hmap2.containsKey(x[i])  && (!hmap2.get(x[i]).equals(ch)))
        {
            return false;
        }
        else
        {
            hmap2.put(x[i],ch);
        }
        
    
    }
        return true;
}
}