'''
Created on 2018. 3. 4.

@author: kfx20
'''
# 삽입 정렬

def ins_sort(a):
    n = len(a)
    for i in range(1, n):
        print("i : ", i)
        key = a[i]        
        j = i - 1
        print("a[i] : ", a[i], ", a[j] : ", a[j])
        while j >= 0 and a[j] > key:
            print("j : ", j)            
            a[j + 1] = a[j]
            j -= 1
            print("array a : ", a)
        a[j + 1] = key
        print("after a : ", a)

d = [2, 4, 5, 1, 3]
ins_sort(d)
print(d)