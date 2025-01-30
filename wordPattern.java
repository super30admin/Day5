//Time complexity o(n);
//Space complexity o(1);

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap map=new HashMap<>();
        String[] ss=s.split(" ");

        if(pattern.length()!=ss.length) {return false;}

        for(Integer i=0;i<ss.length;i++){
            char ch=pattern.charAt(i);
            String word=ss[i];

            if(!map.containsKey(ch)){
                map.put(ch,i);
            }

            if(!map.containsKey(word)){
                map.put(word,i);
            }

            if (map.get(ch) != map.get(word))
                return false;

        }

        return true;
    }
}