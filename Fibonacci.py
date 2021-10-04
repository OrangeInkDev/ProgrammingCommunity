n=int(input("No. of terms: "))
a=[0,1]
for i in range(2,n):
    a.append(a[i-1]+a[i-2])
    
print("The Fibonacci Series is: ",a)