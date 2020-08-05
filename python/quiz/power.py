#Implement integer exponentiation. That is, implement the pow(x, y) function,
#where x and y are integers and returns x^y.
#Do this faster than the naive method of repeated multiplication.
#For example, pow(2, 10) should return 1024.
import sys
sys.setrecursionlimit(1500)

def power(base, exp):
    if exp == 0:
	    return 1
    if exp == 1:
        return base
    if exp == -1:
        return 1/base
    if exp % 2 == 0:
        return pow(base,exp/2) * pow(base,exp/2)
    else:
        return base * pow(base,(exp-1)/2) * pow(base,(exp-1)/2)

res = power(2,2)
print(res)
