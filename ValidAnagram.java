class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        int[] aux = new int[26];

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); ++i) {

            int temp = (int) (s.charAt(i) - 'a');
            aux[temp]++;
        }

        for (int i = 0; i < s.length(); ++i) {
            int temp = (int) (t.charAt(i) - 'a');

            if (aux[temp] <= 0)
                return false;
            aux[temp]--;

        }
        return true;
    }
}