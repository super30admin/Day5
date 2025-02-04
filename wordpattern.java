class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] stringArray = s.split(" ");
        int l= stringArray.length;
        if(pattern.length()!=l) return false;
        char[] charArray = pattern.toCharArray();
        HashMap<Character, String> map1= new HashMap<>();
        HashMap<String, Character> map2= new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch1= charArray[i];
            String s1= stringArray[i];
            if(map1.containsKey(ch1)){
                if(!map1.get(ch1).equals(s1)) return false;

            }
            else{
                map1.put(ch1,s1);
            }

            if(map2.containsKey(s1)){
                if(map2.get(s1)!=ch1) return false;

            }
            else{
                map2.put(s1,ch1);
            }


        }

        return true;

    }
}