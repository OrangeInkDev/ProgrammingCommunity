class Solution {
public:
    string defangIPaddr(string address) {
        string str="";
        for(int i=0;address[i]!='\0';i++)
        {
            if(address[i]=='.')
            {
                str+="[";
                str+=address[i];
                str+="]";
            }
            else
            {
               str+=address[i];
            }
        }
        return str;
    }
};


