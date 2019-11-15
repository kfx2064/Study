'''
Created on 2018. 3. 2.

@author: kfx20
'''
# n명에서 두 명을 뽑아 짝으로 만드는 모든 경우

def print_pairs(a):
    n = len(a)
    for i in range(0, n - 1):
        for j in range(i + 1, n):
            print(a[i], "-", a[j])


name = ["Tom", "Jerry", "Mike"]
print_pairs(name)
print()
name2 = ["Tom", "Jerry", "Mike", "John"]
print_pairs(name2)
