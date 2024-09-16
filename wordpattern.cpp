
// this is word pattern problem in c++ and its not working properly
class Solution {
public:
    bool wordPattern(string pattern, string str) {

        string temp="";
         vector<string> v;
        int count=0;
      for(int i=0;i<str.length();i++)
    {
          if(str[i]!=' ')
         {

              temp+=str[i];
              count++;
         }
     else
     {
     v.push_back(temp);
     temp="";
     }

    }

    if(pattern.length()!=count) return false;

     unordered_map<char,string> hash1;
    unordered_map<string,char> hash2;
        for(int i=0;i<pattern.length();i++)
        {

            if(hash1.count(pattern[i])!=0)
            {
               if( hash1[pattern[i]]!=v[i])
               {
                   return false;
               }
                else
                    return true;
            }
            else
            {
                pair<char,string>p (pattern[i],v[i]);
                hash1.insert(p);
            }

              if(hash2.count(v[i])!=0)
            {
               if( hash2[v[i]]!=pattern[i])
               {
                   return false;
               }
                  else
                      return true;
            }
            else
            {
                pair<string,char>p (v[i],pattern[i]);
                hash2.insert(p);
            }

        }
        return true;
    }
};
