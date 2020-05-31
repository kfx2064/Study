'''
Created on 2018. 3. 3.

@author: kfx20
'''
# 최대 공약수 구하기

def gcd(a, b):
    i = min(a, b)
    while True:
        if a % i == 0 and b % i == 0:
            return i
        i = i - 1
        
print(gcd(1, 5))
print(gcd(3, 6))
print(gcd(60, 24))
print(gcd(81, 27))