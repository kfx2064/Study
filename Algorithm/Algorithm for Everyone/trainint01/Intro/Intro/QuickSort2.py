'''
Created on 2018. 3. 6.

@author: kfx20
'''
# 퀵 정렬

# 범위를 지정하여 정렬하는 재귀 호출 함수
def quick_sort_sub(a, start, end):
    print("맨 처음 : ", start, ", end : ", end)
    # 종료 조건 : 정렬 대상이 1개 이하면 정렬할 필요가 없음
    if end - start <= 0:
        return
    # 기준 값을 정하고 기준 값에 맞춰서 리스트 안에서 각 자료의 위치를 맞춤
    # [기준 대비 작은 값, 기준 값, 기준 대비 큰 값]
    pivot = a[end]  # 편의상 리스트 마지막 값을 기준 값으로
    i = start
    print("i = start : ", i, " = ", start)
    #print("start : ", start, ", end : ", end)
    for j in range(start, end):
        print("i : ", i, ", j : ", j)
        if a[j] <= pivot:
            print("j : ", j)
            print("i : ", i, ", j : ", j, ", a[i] : ", a[i], ", a[j] : ", a[j], ", pivot : ", pivot, ", a : ", a)
            a[i], a[j] = a[j], a[i]
            print("i : ", i, ", j : ", j, ", a[i] : ", a[i], ", a[j] : ", a[j], ", pivot : ", pivot, ", a : ", a)
            i += 1            
    #print("before change : ", a)     
    #print("i : ", i, ", end : ", end)   
    a[i], a[end] = a[end], a[i]
    #print("after change : ", a)
    
    #print("before quick_sort_sub : ", "i : ", i, ", start : ", start)
    # 재귀 호출 부분
    print("fisrt i : ", i)
    quick_sort_sub(a, start, i - 1) # 기준값보다 작은 그룹을 재귀 호출로 다시 정렬
    #print("end first quick sort : ", ", i + 1 : ", i + 1, ", end : ", end)
    print("second i : ", i)
    quick_sort_sub(a, i + 1, end)   # 기준값보다 큰 그룹을 재귀 호출로 다시 정렬
    
def quick_sort(a):
    quick_sort_sub(a, 0, len(a) - 1)
    
d = [6, 8, 3, 9, 10, 1, 2, 4, 7, 5]
quick_sort(d)
print(d)