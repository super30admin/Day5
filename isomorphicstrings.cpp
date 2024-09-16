// time complexity is o(n) because we are traversing till the length of string
//although we have 2 hashmaps still we need o(n) time because both the traversal and mirror traversal is in the same loop
// space complexity o(1) since here we are mapping char to char and these are finite characters

// isomorphic string question in c++
// it was not getting correct input please check

class Solution {
public:
    bool isIsomorphic(string s, string t) {

        int n=s.length();
        int n1=t.length();
        //edge case
        if(n!=n1)
        {
            return false;
        }
         unordered_map<char,char> mapp;
        unordered_map<char,char> mappmirror;
        for(int i=0;i<n;i++)
        {
            char key=s[i];
            char key1=t[i];
            if(mapp.count(key)==0)
            {
                pair<char,char> p(key,key1);
                mapp.insert(p);
            }
            else
            {
                if(mapp[key]==key1)
                {
                    return true ;

                }
                else
                     return false;
            }
             if(mappmirror.count(key1)==0)
            {
                pair<char,char> d(key1,key);
                mappmirror.insert(d);
            }
            else
            {

                if(mappmirror[key1]==key)
                {
                    return true ;

                }
                else
                  return false;
            }

        }

      return true;
    }
};
