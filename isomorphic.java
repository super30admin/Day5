public class isomorphic {

	public boolean isIsomorphic(String s, String t) {
        int[] a1 = new int[256];
        int[] a2 = new int[256];
        
        for(int i = 0; i < s.length(); i++){
            if(a1[s.charAt(i)] == 0 && a2[t.charAt(i)] == 0){
                a1[s.charAt(i)] = t.charAt(i);
                a2[t.charAt(i)] = s.charAt(i);
            }
            else if(a1[s.charAt(i)] != t.charAt(i) || a2[t.charAt(i)] != s.charAt(i)) return false;
        }
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isomorphic is = new isomorphic();
		String s ="egg";
		String t ="add";
		System.out.println("Is '"+s+"' and '"+t+"' are Isomorphic: \t"+is.isIsomorphic(s, t));
		
		s ="foo";
		t ="bar";
		System.out.println("Is '"+s+"' and '"+t+"' are Isomorphic: \t"+is.isIsomorphic(s, t));
		
		
	}

}
