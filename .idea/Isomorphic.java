class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        char[] first = new char[100];
        char[] second = new char[100];
        if(s.length()!=t.length())
            return false;
        for(int i =0; i<s.length();i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if(first[schar - ' ']==0)
                first[schar - ' '] = tchar;
            else if(first[schar - ' ']!=tchar)
                return false;
            if(second[tchar - ' ']==0)
                second[tchar - ' '] = schar;
            else if(second[tchar - ' ']!=schar)
                return false;
        }
        return true;
    }
}

//time complexity is O(l)
//space complexity is O(1)