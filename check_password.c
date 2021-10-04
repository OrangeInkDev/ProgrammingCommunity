#include<stdio.h>
#include<string.h>
#include<ctype.h>

int checkPassword(char str[],int n){
    int countCap=0;
    int countDig=0;
    if((str[0]>=48 && str[0]<=57) || n<4){
        return 0;
    }
    for(int i=0;i<n;i++){
        if(str[i]=='/'||str[i]==" "){
            return 0;
        }
        if(str[i]>='A' && str[i]<'Z')
            countCap++;
        if(isdigit(str[i])!=0)
            countDig++;

    }
    if(countCap==0 || countDig==0)
        return 0;
    else return 1;

}

int main(){
    char str[100];
    int n;
    printf("Enter the Password: ");
    scanf("%s",str);
    n=strlen(str);

    if(checkPassword(str,n)==1)
        printf("VALID PASSWORD");
    else
        printf("INVALID PASSWORD");
    return 0;

}