'''
Created on 2018. 3. 1.

@author: kfx20
'''
# 1부터 n까지 연속한 숫자의 제곱의 합

def sum_n(n):    
    a = 0
    a = (n * (n + 1) * (2 * n + 1)) // 6    
    return a

print(sum_n(2))
print(sum_n(5))
print(sum_n(10))
