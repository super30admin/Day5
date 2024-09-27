import java.util.HashMap;

class solution {
    public boolean wordPattern(String pattern, String s) {

        String [] stringArray=s.split(" ",0);
        if(pattern.length()!=stringArray.length){
            return false;
        }

        HashMap <Character,String> hm=new HashMap<>();
        for(int i=0;i<stringArray.length;i++){
            if(!hm.containsKey(pattern.charAt(i))){
                if(hm.containsValue(stringArray[i])){
                    return false;
                }
                hm.put(pattern.charAt(i),stringArray[i]);
            }else{

                if(!hm.get(pattern.charAt(i)).equals(stringArray[i])){
                    return false;
                }
            }
        }

        return true;
    }




}