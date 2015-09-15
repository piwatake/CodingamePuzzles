import sys
import math

# Auto-generated code below aims at helping you parse
# the standard input according to the problem statement.




def findhigh(x):
    highloc = -1
    high = x[0]
    index = 0;
    for i in range(index, len(x)):
        if x[i] >= high:
            highloc = i
            high = x[i]
        i = i + 1
    
    return highloc
        
        
        




# game loop

moveleft = 0

while 1:
    spaceX, spaceY = [int(i) for i in raw_input().split()]
    myarr = []
    for i in xrange(8):
        mountainH = int(raw_input()) # represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
        #print >> sys.stderr, i
        myarr.insert(i, mountainH)
    # Write an action using print
    # To debug: print >> sys.stderr, "Debug messages..."
    
    
    
    #print >> sys.stderr, "index: ", spaceX

    if spaceY == myarr[spaceX]:
        print >> sys.stderr, "breakout"
        break
    
    # first tuple is x loc, 2nd tuple item is height
    temp = findhigh(myarr)

    
    
    print >> sys.stderr, "index of highest",temp,"curr at ",spaceX
    

    if spaceX == temp:
        print "FIRE"
        #myarr[spaceX] -= 1
    else:
        print "HOLD"
    
    
    
    
    #incr/decr
    if moveleft == 0:
        spaceX+=1
    else: 
        spaceX-=1
        
        
    #handle wraparound
    if spaceX == 8 and moveleft == 0:
        #print >> sys.stderr, "descent"
        spaceX -= 1
        moveleft = 1
        spaceY-=1
    elif spaceX == -1 and moveleft == 1:
        spaceX += 1
        moveleft = 0
        spaceY-=1
        #print >> sys.stderr, "descent"

        
        
        
        

    # either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).



        
        
        
        
        
        