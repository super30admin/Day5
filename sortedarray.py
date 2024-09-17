low = 0
high = 1
while(target > reader.get(high)):
    low = high 
    high = high * 2

while(low<=high):
    mid = (low + (high - low )//2)
    if(target == reader.get(mid)):
        print (mid)
    elif(target <reader.get(mid)):
        high = mid - 1
    else:
        low = mid + 1
        
print (-1)