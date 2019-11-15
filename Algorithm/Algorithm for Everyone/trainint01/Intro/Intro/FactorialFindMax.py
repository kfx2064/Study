'''
Created on 2018. 3. 3.

@author: kfx20
'''
# 최대값 구하기 팩토리얼

def find_max(a, n):
    print("a : ", a)
    print("n : ", n)
    if n == 1:
        return a[0]
    max_n_1 = find_max(a, n - 1)
    print("max_n_1 : ", max_n_1)
    print("a[n - 1] : ", a[n - 1])
    if max_n_1 > a[n - 1]:
        return max_n_1
    else:
        return a[n - 1]
    
    
    
v = [11, 22, 33, 44, 23, 13, 43, 77]
print(find_max(v, len(v)))