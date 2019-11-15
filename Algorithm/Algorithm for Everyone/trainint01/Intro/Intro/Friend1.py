'''
Created on 2018. 3. 11.

@author: kfx20
'''
# 친구 리스트에서 자신의 모든 친구를 찾는 알고리즘
# 입력 : 친구 관계 그래프 g, 모든 친구를 찾을 자신 start
# 출력 : 모든 친구의 이름

def print_all_friends(g, start):
    qu = [] # 기억 장소1 : 앞으로 처리해야 할 사람들 큐에 저장
    done = set()    #기억장소 2 : 이미 큐에 추가한 사람들 집합에 기록(중복 방지)
    
    # start를 큐와 셋에 넣기
    qu.append(start)    
    done.add(start)
    
    while qu:   # 큐에 처리할 사람이 남아있는 동안
        p = qu.pop(0)   # 큐에서 처리할 대상 하나 꺼내고
        print(p)    # 이름을 출력하고
        for x in g[p]:   # 그의 친구들 중에        
            if x not in done:   #아직 큐에 추가된 적이 없는 사람을
                # 큐와 집합에 추가
                qu.append(x)
                done.add(x)
                
                
fr_info = {
    'Summer': ['John', 'Justin', 'Mike'],
    'John' : ['Summer', 'Justin'],
    'Justin' : ['John', 'Summer', 'Mike', 'May'],
    'Mike' : ['Summer', 'Justin'],
    'May' : ['Justin', 'Kim'],
    'Kim' : ['May'],
    'Tom' : ['Jerry'],
    'Jerry' : ['Tom']
    }

print_all_friends(fr_info, 'Summer')
print()
print_all_friends(fr_info, 'Jerry')