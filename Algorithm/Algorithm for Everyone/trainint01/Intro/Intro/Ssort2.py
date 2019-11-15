'''
Created on 2018. 3. 4.

@author: kfx20
'''
# 선택 정렬

def sel_sort(a):
    n = len(a)
    for i in range(0, n - 1): # 0부터 n-2까지 반복
        # i번 위치부터 끝까지 자료 값 중 최솟값의 위치를 찾음
        min_idx = i        
        
        for j in range(i + 1, n):
            
            if a[j] < a[min_idx]:
                chngMin = j        
                a[i], a[chngMin] = a[chngMin], a[i]
            
                
d = [2, 4, 5, 1, 3]
sel_sort(d)
print(d)