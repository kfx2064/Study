'''
Created on 2018. 3. 3.

@author: kfx20
'''

def fact(n):
    f = 1
    for i in range(1, n + 1):
        f = f * i
        print("f = ", f)
    return f

print(fact(1))
print(fact(5))
print(fact(10))
