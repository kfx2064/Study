'''
Created on 2018. 3. 3.

@author: kfx20
'''
# 연속한 숫자의 곱을 구하는 알고리즘

def fact(n):
    print("n : ", n)
    if n <= 1:
        return 1
    return n * fact(n - 1)

print(fact(1))
print(fact(5))
print(fact(10))