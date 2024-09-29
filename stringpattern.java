class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if(pattern.length()!=strs.length) return false;
        String[] map1= new String[26];
        HashSet<String> set = new HashSet<>();

        for(int i=0;i<strs.length;i++){
            
            if(map1[pattern.charAt(i) - 'a']==null){
                if(set.contains(strs[i])){
                    return false;
                }
                map1[pattern.charAt(i) - 'a'] = strs[i];
                set.add(strs[i]);
            }
            else{
                if(!set.contains(strs[i])){
                    return false;
                }
                if(!map1[pattern.charAt(i) - 'a'].equals(strs[i]))//%pattern.length())).equals(strs[i]))
                    return false;
            }
        }
        return true;
    }
}
