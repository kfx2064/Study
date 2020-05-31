'''
Created on 2018. 3. 11.

@author: kfx20
'''
# 이분 탐색과 재귀 호출
# 리스트 a, 찾는 값 x
# 특정 숫자를 찾으면 그 값의 위치, 찾지 못하면 -1

# 리스트 범위를 정하여 찾은 후 
# 그 범위 안에서 x를 찾는 재귀 함수

def binary_search_sub(a, x, start, end):
    # 종료 조건 : 남은 탐색 범위가 비었으면 종료
    if start > end :
        return -1
    
    mid = (start + end) // 2    # 탐색 범위의 중간 위치
    if x == a[mid]: #발견했다면
        return mid
    elif x > a[mid]: # 찾는 값이 더 크다면
        return binary_search_sub(a, x, mid + 1, end)    # 오른쪽으로 이동한 값을 재귀 호출
    else:
        return binary_search_sub(a, x, start, mid - 1)  # 찾는 값이 더 작으면 왼쪽으로 이동한 값 재귀 호출
    return -1

def binary_search(a, x):
    return binary_search_sub(a, x, 0, len(a) - 1)

d = [1, 4, 9, 16, 25, 36, 49, 64, 81]
print(binary_search(d, 36))
print(binary_search(d, 50))    