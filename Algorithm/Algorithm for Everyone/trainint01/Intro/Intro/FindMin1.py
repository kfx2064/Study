'''
Created on 2018. 3. 2.

@author: kfx20
'''
#최소값 구하기

def find_min(a):
    minNum = a[0]
    n = len(a)
    for i in range(1, n):
        if a[i] < minNum:
            minNum = a[i]
             
    return minNum
    
    
    
v = [17, 92, 18, 33, 58, 7, 34, 42]
print(find_min(v))
