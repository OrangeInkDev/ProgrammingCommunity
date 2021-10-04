def FrequentCharacterReplaced(str1,x):
    str1=list(str1)
    d={}
    for i in range(0,len(str1)):
        d[str1[i]]=str1.count(str1[i])
    ch=[i for i in d.keys() if d[i]==max(d.values())]
    c=min(ch)
    for i in range(len(str1)):
        if(str1[i]==c):
            str1[i]=x
    return str1
            
str1=input("Enter a String: ")
x=input("Enter the character to be replaced with: ")
s=FrequentCharacterReplaced(str1,x)
print("Replaced String: ",end='')
for i in range(0,len(s)):
    print(s[i],end='')