import sys
import math
import collections

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.

def mergesort(alist):
    if len(alist) <= 1:
        return alist
    left = []
    right = []
    mid = len(alist)/2
    
    
    left.extend(alist[0:mid])
    #for i in range(mid - 1):
    #    left.append(alist[i])
    #for j in range(mid, len(alist), 1):
    #    right.append(alist[j])
     
    right.extend(alist[mid:len(alist)])
        
    left = mergesort(left)
    right = mergesort(right)
    
    return merge(left, right)
    
def merge(lista, listb):
    sortlist = []
    
    while lista and listb:
        if lista[0] <= listb[0]:
            sortlist.append(lista.pop(0))
        else:
            sortlist.append(listb.pop(0))
        
    while lista:
        sortlist.append(lista.pop(0))

        
    while listb:
        sortlist.append(listb.pop(0))

        
    return sortlist
    



myarr = []
global dif
dif = -1
n = int(raw_input())
for i in xrange(n):
    pi = int(raw_input())
    #print >> sys.stderr, pi
    myarr.append(pi)
    
myarr = mergesort(myarr)
#pairarr = list(myarr)

#for j in range(len(myarr)):
#    print >> sys.stderr, myarr[j]

start = 0

for a in range(start,len(myarr),1):
    
    if dif == 0:
        break
    for b in range(start,len(myarr),1):
        #don't compare to yourself
        if a == b or dif == 0:
            break
        founddif = abs(myarr[a] -  myarr[b])
        if  founddif < dif or dif == -1:
            dif = founddif
        start = start + 1
#print >> sys.stderr, ("dif is "+ str(dif))
    


# Write an action using print
# To debug: print >> sys.stderr, "Debug messages..."

print str(dif)


