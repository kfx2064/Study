# -*- coding: utf-8 -*-
'''
Created on 2021. 10. 29.

@author: USER
'''

userName = input("예금주 : ");
amount = input("예금액 : ");
intAmount = int(amount);
intYear = int(input("거치년수 : "));

print(userName);
calcAmount = intAmount + ((intAmount * 0.03) * intYear);
print(calcAmount);