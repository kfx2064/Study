'''
Created on 2018. 3. 6.

@author: kfx20
'''
# 쉬운 퀵 정렬

def quick_sort(a):
    n = len(a)
    if n <= 1:
        return a
    
    pivot = a[-1]
    g1 = []
    g2 = []
    
    for i in range(0, n - 1):
        if a[i] < pivot:
            g1.append(a[i])
        else:
            g2.append(a[i])
        print("pivot : ", pivot)        
        print("g1 : ", g1)
        print("g2 : ", g2)
    
    print("end recall")                
    
    return quick_sort(g1) + [pivot] + quick_sort(g2)

d = [6, 8, 3, 9, 10, 1, 2, 4, 7, 5]
print(quick_sort(d))



    