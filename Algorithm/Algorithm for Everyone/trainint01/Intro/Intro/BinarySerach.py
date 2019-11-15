'''
Created on 2018. 3. 11.

@author: kfx20
'''
# 이분 탐색
# 리스트 a, 찾는 값 x
# 찾는 값이 없으면 -1 리턴

def binary_search(a, x):
    # 탐색할 범위를 지정하는 변수 start, end
    # 리스트 전체를 범위로 탐색 시작(0 ~ len(a) - 1)
    start = 0
    end = len(a) - 1
    
    
    while start <= end :
        mid = (start + end) // 2
        if x == a[mid] :
            return mid
        elif x > a[mid] :   # 찾는 값이 더 크면 오른쪽으로 범위를 좁힘
            start = mid + 1
        else :  # 찾는 값이 더 작으면 왼쪽으로 범위를 좁힘
            end = mid - 1
    return -1   # 찾지 못했을 때


d = [1, 4, 9, 16, 25, 36, 49, 64, 81]
print(binary_search(d, 36))
print(binary_search(d, 50))
    