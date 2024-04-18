a = 40
b = 20

factor_a = []
factor_b = []

for i in range(1,a+1):
    if(a%i == 0):
        factor_a.append(i)

for j in range(1,b+1):
    if(b%j == 0):
        factor_b.append(j)

print(factor_a)
print(factor_b)

comman = []

for k in factor_a:
    for l in factor_b:
        if k == l:
            comman.append(k)

print(comman[-1])
    

