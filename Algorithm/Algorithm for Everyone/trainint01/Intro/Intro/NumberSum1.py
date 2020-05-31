'''
Created on 2018. 3. 1.

@author: kfx20
'''
#1부터 n까지 연속한 숫자의 합을 구하는 알고리즘

def sum_n(n):
    s = 0
    for i in range(1, n + 1):
        s = s + i
    return s

print(sum_n(10))
print(sum_n(100))