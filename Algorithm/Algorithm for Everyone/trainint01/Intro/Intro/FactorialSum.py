'''
Created on 2018. 3. 3.

@author: kfx20
'''
# 1부터 n까지 합 구하기 재귀 호출

def fact(n):
    print("n : ", n)
    if n <= 1:
        return 1
    return n + fact(n - 1)


print(fact(1))
print(fact(2))
print(fact(5))
        